package Programs;

public class Palindrome {
	
  
	public static void main(String[] args) {
		isPalindrome(121);
		stringPalindrome("dad");
		StringPalindrome();

	}
	
	
	public static void isPalindrome(int num) {
		int sum=0;
		int r=0;
		int temp;
		temp= num;
		while(num>0) {
			r = num%10;
			sum = (sum*10)+r;
			num= num/10;
		}
		if(temp==sum) {
			System.out.println("number is palindrome");
		}
		else {
			System.out.println("nu is not a palindrome");
		}
	}
	
	public static void stringPalindrome(String s) {
		String rev = "";
		
		for(int i=s.length()-1;i>=0; i--) {
			rev = rev+s.charAt(i);
		}
		if(s.equals(rev)) {
			System.out.println("string is palindrom");
		}
		else {
			System.out.println("String is not palindrmoe");
		}
	}
	
	
	//using stringbuffer
	public static void StringPalindrome() {
		StringBuffer s1 = new StringBuffer("ana");
		StringBuffer s2 = new StringBuffer(s1);
		s2.reverse();
		if(String.valueOf(s1).equals(String.valueOf(s2)) ){
			System.out.println("String is palindrome");
		}
		else {
			System.out.println("String is not a palidrome");
		}
	}

	
	
}
