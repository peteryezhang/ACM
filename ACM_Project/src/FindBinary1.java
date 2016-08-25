import java.util.Scanner;

public class FindBinary1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int n = input.nextInt();
			String binaryString = Integer.toBinaryString(n);
			char[] binaryChars = binaryString.toCharArray();
			int count =0;
			for(char temp : binaryChars)
			{
				if (temp == '1') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
