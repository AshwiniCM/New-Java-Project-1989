package Programs;

public class PrimeNumbers {

	public static void main(String[] args) {
		System.out.println(prime(5));
		rangeOfPrime(20);
		primeNum();
	}
	
	public static boolean prime(int num) {
		if(num<=1) {
			return false;
		}
		
	for(int i=2; i<num;i++) {
		if(num%2==0) {
			return false;
		}
		}	
		return true;
		}
	
	
	public static void rangeOfPrime(int num) {
		for(int i=2; i<=20;i++) {
			if(prime(i)) {
			System.out.println(i);
		}
		}
	}
	
	
		public static void primeNum() {
			for(int i=2; i <=100; i++) {
				if(i%2==1) {
					System.out.println(i+"  ");
				}
			}
		}
}