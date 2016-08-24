import java.util.Arrays;
import java.util.Scanner;

public class DynamicProgramming {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			//Length of the rod
			int n = Integer.parseInt(input.nextLine());
			//Price of rod's length
			int[] p = new int[n+1];
			String pString = input.nextLine();
			String[] pStringArray = pString.split(" ");
			//Init p array
			for(int i=0;i<n;i++)
			{
				p[i+1] = Integer.parseInt(pStringArray[i]);
			}
			//DP
			//Total price of the rod
			int[] r = new int[n+1];
			Arrays.fill(r, 0);
			for(int j = 1;j<=n;j++)
			{
				int q = 0;
				for(int i=1;i<=j;i++)
				{
					q = Math.max(q,p[i]+r[j-i]);
				}
				r[j] = q;
			}
			System.out.println(r[n]);
		}
	}
	
}
