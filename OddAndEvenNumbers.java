package Programs;

public class OddAndEvenNumbers {

	public static void main(String[] args) {
		
		int num=10;
		int result=num;
		while(result>=2) {
			result= result-2;
		}
		if(result==1) {
			System.out.println("odd number");
		}
		else {
			System.out.println("even number");
		}
	}

}
