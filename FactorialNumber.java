package Programs;

public class FactorialNumber {

	public static void main(String[] args) {
     fact(7);

	}
	
	public static void fact(int num) {
		int fact= 1;
		for(int i=1; i<=num; i++) {
			fact=fact*i;
			}
		System.out.println(fact);
	}

}
