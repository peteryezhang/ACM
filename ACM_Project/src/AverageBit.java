import java.util.Scanner;

public class AverageBit {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		while(input.hasNextInt())
		{
			int A = input.nextInt();//Integer.parseInt(input.nextLine());
			int count = 0;
			if (A<=2) {
				System.out.println(1);				
			}
			else {
				for (int i = 2; i < A; i++) {
					int temp = A;
					while(temp>=i)
					{
						temp = (int)(temp/i);
						count++;
					}
					count++;
				}
				System.out.println(count + "/" + (A-2));	
			}
		}
	}

}
