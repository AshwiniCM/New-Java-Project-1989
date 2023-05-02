package Programs;

public class AddAllTheIntergers {

	public static void main(String[] args) {
		String s ="as12h3w4";
		int sum=0;
		String num="";
		for(int i=0;i<s.length(); i++) {
			if(Character.isDigit(s.charAt(i))) {
			sum+=Integer.parseInt(String.valueOf(s.charAt(i)));
			}
		}
		System.out.println(sum);
	}

}
