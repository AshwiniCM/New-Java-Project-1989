package Programs;

public class ReverseNumber {

	public static void main(String[] args) {
		reverse("ash");
		reverseNum(123);
		reverse1("manish");
		reverse2("chintu");

	}

	
	
	public static void reverse(String name) {
		
		for(int i=name.length()-1;i>=0;i--) {
			System.out.print(name.charAt(i));
		}
	}
	
	
	public static void reverse1(String s) {
		char c[]= s.toCharArray();
		for(int i=c.length-1; i>=0; i--) {
			System.out.print(c[i]);
		}
	}
	
	
	public static void reverse2(String s) {
		String s1[] = s.split("");
		for(int i =s1.length-1; i>=0; i--) {
			System.out.print(s1[i]);
		}
		
	}
	public static void reverseNum(int num) {
		System.out.println("+++++++++++++");
		int sum=0;
		int rem=0;
		while(num>0) {
			rem= num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
