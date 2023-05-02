package Programs;

public class WordCount {

	public static void main(String[] args) {
		characterCount("ash");
		lengthOfString("bhuvik");
		String s= "anshu anu men book";
		String s1[] =s.split(" ");
		System.out.println(s1.length);
		System.out.println(s.lastIndexOf(""));

	}
	
	public static void characterCount(String a) {
		char ch[] = a.toCharArray();
		System.out.println(ch.length);
	}

	
	public static void lengthOfString(String a) {
		char ch []= a.toCharArray();
		int count =0;
		for(int i =0; i<=ch.length-1; i++) {
			count++;
		}
		System.out.println(count);
	}
}
