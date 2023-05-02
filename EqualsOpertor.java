package Programs;

public class EqualsOpertor {

	public static void main(String[] args) {
		
		String s= "ash";
		String s1 = new String ("ash");
		String s2 = new String("ash");
		String s3= "ash";
        System.out.println(s==s1);
        System.out.println(s.equals(s1));
        System.out.println(s==s3);
        System.out.println(s1==s2);
        System.out.println(s1.endsWith(s2));
        String str = null;
        System.out.println(str.valueOf(10));
        
      
	}

}
