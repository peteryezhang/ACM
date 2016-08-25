import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatch {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String rule = input.nextLine();
			String txt = input.nextLine();
			System.out.println(isMatch(rule, txt));
		}
	}
	
	private static boolean isMatch(String reg,String txt) {
		String prePattern = reg.replace("*",".*");
		String patternString = prePattern.replace("?", ".{1}");
		Pattern pattern = Pattern.compile(patternString);
		Matcher matcher = pattern.matcher(txt);
		return matcher.matches();
		
	}
}
