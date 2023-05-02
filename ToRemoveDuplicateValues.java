package Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ToRemoveDuplicateValues {

	public static void main(String[] args) {
		removeDuplicate();
		String s[]= {"india", "is","great", "is"};
        Set set = new HashSet(Arrays.asList(s));
        System.out.println(set);
	}

	
	public static void removeDuplicate() {
		String s[]= {"india", "an","great", "is", "in	", "india"};
		String str= "";
		for(int i =0;i<s.length; i++) {
			if(!str.contains(s[i])) {
				str+=s[i]+" ";
				}
		}
		System.out.println(str);
}
};
