import java.util.Scanner;

public class ApproximateInt {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			double num = input.nextDouble();
			System.out.println((int)(num+0.5));
		}
	}
}
