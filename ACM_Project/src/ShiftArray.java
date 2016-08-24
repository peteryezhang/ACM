import java.util.Arrays;
import java.util.Scanner;

public class ShiftArray {
public static void main(String[] args) {
	String s = new String("1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./");
	String buff = "";
	char[] charArray = s.toCharArray();
	char[] charBuffArray = null;
	Scanner input = new Scanner(System.in);
	int i,c;
	while(input.hasNext())
	{
		buff = input.nextLine();
		charBuffArray = buff.toCharArray();
	}
	if (charBuffArray!=null) {
		for(i=0;i<charBuffArray.length;i++)
		{
			int index = s.indexOf(charBuffArray[i]);
			if (index != -1) {
				System.out.print(charArray[index-1]);				
			}
			else {
				System.out.print(charBuffArray[i]);
			}
		}
	}
}
}
