import java.util.Arrays;
import java.util.Scanner;

public class StringChars {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String s = "";
		char[] cArray = new char[100];
		Arrays.fill(cArray, 'A');
		while(input.hasNext())
		{
			s = input.nextLine();
			cArray = s.toCharArray();	
		}
		for(int i=0;i< cArray.length;i++)
		{
			System.out.print(cArray[i]);
		}
		System.out.println();
	}
}
