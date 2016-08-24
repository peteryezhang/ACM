import java.util.Arrays;
import java.util.Scanner;

public class T3_3SnakeArray {
public static void main(String[] args) {
	final int MAXIN =10;
	int[][] a = new int[MAXIN][MAXIN];
	
	int n = 0,x = 0,y = 0,tot = 0;
	Scanner input = new Scanner(System.in);
	while(input.hasNext())
	{
		n = input.nextInt();
	}
	for(x=0;x<MAXIN;x++)
		Arrays.fill(a[x], 0);
	tot = a[0][n-1] = 1;
	x = 0;
	y = n-1;
	while(tot< n*n)
	{
		while(x+1<n && a[x+1][y] == 0) a[++x][y] = ++tot; //->right
		while(y-1>=0 &&a[x][y-1] == 0) a[x][--y] = ++tot; //down
		while(x-1>=0&&a[x-1][y]==0) a[--x][y] = ++tot; //left
		while(y+1<n&&a[x][y+1]==0) a[x][++y] = ++tot;
	}
	for(x=0;x<n;x++)
	{
		for(y=0;y<n;y++)
		{
			System.out.print(a[x][y]);
			System.out.print(" ");			
		}
		System.out.println();
	}
}
}
