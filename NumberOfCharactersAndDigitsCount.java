package Programs;

public class NumberOfCharactersAndDigitsCount {

	public static void main(String[] args) {
	String s= "123String";
	int dCount=0;
	int cCount=0;
	for(int i=0; i<s.length(); i++){
		if(Character.isDigit(s.charAt(i))) {
			dCount++;
		}
		else {
			cCount++;
		}
	}
     System.out.println(dCount  +" "  +cCount);
	}

}
