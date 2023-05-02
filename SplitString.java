package Programs;

import java.util.StringTokenizer;

public class SplitString {

	public static void main(String[] args) {
		splitString();
		System.out.println();
		String s1 = "India is great";
		StringTokenizer s2 = new StringTokenizer(s1);
		while(s2.hasMoreTokens()) {
			System.out.println(s2.nextToken());
		}
		
	}
	
	
	public static void splitString() {
		String s1 ="abdul kalam";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)==' ') {
				System.out.println();
				continue;
			}
			System.out.print(s1.charAt(i));
		}
	}

}
