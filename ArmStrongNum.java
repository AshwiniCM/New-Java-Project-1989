package Programs;

public class ArmStrongNum {

	public static void main(String[] args) {
		armStrong(1634);
	}
	
	public static void armStrong(int num) {
		int temp;
		int r=0;
		int cube =0;
		temp=num;
		while(num>0) {
			r= num%10;
			num= num/10;
			cube=cube+(r*r*r);
		}
		if(cube==temp) {
			System.out.println("num is armstrong");
		}
		else {
			System.out.println("num is not armstrong");
		}
	}

}
