import java.util.Scanner;

public class CountCharNums {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String s = input.nextLine();
			String keyString = input.nextLine().toUpperCase();
			s = s.toUpperCase();
			String[] sArray = s.split("");
			int count = 0;
			for(int i =0;i<sArray.length;i++)
			{
				if (keyString.equals(sArray[i])) {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}
