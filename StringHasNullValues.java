package Programs;

public class StringHasNullValues {

	public static void main(String[] args) {
		String s [] = {"ash", "null", "mn"};
		for(int i=0; i<s.length;i++) {
			if(s[i]==null)
			System.out.println(i);
		}

	}

}
