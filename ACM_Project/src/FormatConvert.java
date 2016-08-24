import java.util.Scanner;

public class FormatConvert {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String s = input.nextLine();
			String num = s.substring(2);
			System.out.println(Integer.parseInt(num,16));
		}
	}
	
}
