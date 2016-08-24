import java.util.Arrays;
import java.util.Scanner;

public class ArrayInput {
	public static void main(String[] args) {
		int i,n=0;
		int MAX = 100;
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		Scanner input = new Scanner(System.in);
		while(input.hasNextInt())
		{
			a[n++] = input.nextInt();
		}
		b = Arrays.copyOf(a, n);
		for(i = n-1;i>=1;i--)
		{
			System.out.print(b[i]);
		}
		System.out.print(a[0]);

	}
}
