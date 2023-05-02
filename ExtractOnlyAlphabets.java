package Programs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractOnlyAlphabets {

	public static void main(String[] args) {
		String s= "ash123hu";
		Pattern p = Pattern.compile("[aA-zZ]+");
		Matcher m = p.matcher(s);
		while(m.find())
		{
			System.out.println(m.group()  +" ");
		}

	}

}
