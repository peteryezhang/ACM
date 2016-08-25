import java.util.Scanner;

public class IP2Integer {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int s = input.nextInt();
			System.out.println(Integer.toBinaryString(s));
		}
	}
}
