package Programs;

public class FibbinociSeries {

	public static void main(String[] args) {
		fibinoci();
	}

	public static void fibinoci() {
		int num=0;
		int num1= 1;
		int num2;
		System.out.println(num  + " " +num1);
		for(int i =2; i<=5; i++) {
			num2= num+num1;
			System.out.println("  "+num2);
			num =num1;
			num1= num2;
		}
		
	}
}
