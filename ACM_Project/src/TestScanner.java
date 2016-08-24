import java.util.Scanner;

public class TestScanner {

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		String s = "";
		while(input.hasNext())
		{
			s = input.nextLine();
			System.out.println(s);
		}
	}
}
