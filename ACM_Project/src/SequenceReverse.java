import java.util.Scanner;

public class SequenceReverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String s = input.nextLine();
			String[] sArray = s.split(" ");
			for (int i = sArray.length-1; i >0; i--) {
				System.out.print(sArray[i]);
				System.out.print(" ");
			}
			System.out.print(sArray[0]);
			System.out.println();
		}
	}
}
