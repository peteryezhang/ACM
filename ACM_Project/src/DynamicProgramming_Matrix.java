import java.util.Arrays;
import java.util.Scanner;
//A1A2A3...AN
//Input Matrix Count n
//Input p[n+1] p0 p1 ...pn
public class DynamicProgramming_Matrix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			//Init n
			int n = Integer.parseInt(input.nextLine());
			String pString = input.nextLine();
			String[] pArray = pString.split(" ");
			//Init p[]
			int p[] = new int[n+1];
			for (int i = 0; i < pArray.length; i++) {
				p[i] = Integer.parseInt(pArray[i]);
			}
			int[][] m = new int[n+1][n+1];
			int[][] s = new int[n+1][n+1];
			for(int i=1;i<=n;i++)
			{
				Arrays.fill(m[i], 0);
				Arrays.fill(s[i], 0);
			}
			for(int l=2;l<=n;l++)	//l is the chain length
			{
				for (int i = 1; i <= n-l+1; i++) {
					int j = i+l-1;
					m[i][j] = 95555;
					int q = 0;
					for (int k = i; k <= j-1; k++) {
						q = m[i][k] + m[k+1][j] + p[i-1]*p[k]*p[j];
						if (q<m[i][j]) {
							m[i][j] = q;
							s[i][j] = k;
						}
					}
				}
			}
			System.out.println(m[2][5]);
		}
	}
}
