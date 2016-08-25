//Input Item Num N
//Item Item Volume C1,C2...Cn
//Input Item Value W1,W2...Wn
import java.util.Scanner;

public class Package01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while (input.hasNext()) {
			int n = Integer.parseInt(input.nextLine());
			int v = Integer.parseInt(input.nextLine());
			String[] cString = input.nextLine().split(" ");
			String[] wString = input.nextLine().split(" ");
			int[] c = new int[n+1];
			int[] w = new int[n+1];
			int[][] F = new int[n+1][v+1];
			//Init c w arrays
			for(int i=1;i<n+1;i++)
			{
				c[i] = Integer.parseInt(cString[i-1]);
			}
			for(int i=1;i<n+1;i++)
			{
				w[i] = Integer.parseInt(wString[i-1]);
			}
			//Dp
			for(int i=1;i<=n;i++)
			{
				for(int k=1;k<=v;k++)
				{
					F[i][k] = F[i-1][k];
					if (k>=c[i]) {
						F[i][k] = Math.max(F[i][k], F[i-1][k-c[i]] + w[i]);
					}
				}
			}
			System.out.println(F[n][v]);
		}
	}
}
