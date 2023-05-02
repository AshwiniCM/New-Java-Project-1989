package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GetAllTheIntegerValuesUsingRegularExpression {

	public static void main(String[] args) {
		String s = "ashwini123Ash098";
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher(s);
		while(m.find()) {
			System.out.println(m.group()  +" ");
		
		}

	}

}
