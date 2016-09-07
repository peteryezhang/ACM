import java.util.Scanner;

public class PartialMax {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int n = Integer.parseInt(input.nextLine());
			String numString = input.nextLine();
			String[] numArray = numString.split(" ");
			int[] array = new int[n];
			//Init array
			for (int i = 0; i < array.length; i++) {
				array[i] = Integer.parseInt(numArray[i]);
			}
			//DP
			int sum = array[0];
			int result = array[0];
			for (int i = 1; i < array.length; i++) {
				if (sum > 0) {
					sum += array[i];
				}
				else {
					sum = array[i];
				}
				if (sum>result) {
					result = sum;
				}
			}
			System.out.println(result);
			
			
		}
	}
}
