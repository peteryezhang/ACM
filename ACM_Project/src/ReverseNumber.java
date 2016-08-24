import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String s = input.nextLine();
			StringBuffer sb = new StringBuffer(s);
			String sNew = sb.reverse().toString();
			System.out.println(sNew);
			
		}
	}
}
