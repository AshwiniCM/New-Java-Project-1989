package Programs;

public class SumOfIntegers {

	public static void main(String[] args) {
		int[] ar= {1,2,3,4,5};
		
		sum(ar, 3);
		
	}

	
	public static void sum(int arr[], int sum) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i]+arr[j]==sum) {
					System.out.println(arr[i]   +"+"  +arr[j]  +"= "+sum);
				}
			}
		}
	}
}
