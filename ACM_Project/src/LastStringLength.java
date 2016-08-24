import java.util.Scanner;

public class LastStringLength {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			String s = input.nextLine();
			String[] sArray = s.split(" ");
			if (!s.isEmpty()) {
				System.out.println(sArray[sArray.length-1].length());
			}
			else {
				System.out.println(0);				
			}
		}
	}
	
}
