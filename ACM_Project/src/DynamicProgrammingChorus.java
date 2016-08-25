import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class DynamicProgrammingChorus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int n = Integer.parseInt(input.nextLine());
			String[] hArray = input.nextLine().split(" ");
			int[] h = new int[n+1]; h[0] = 0;
			for(int i=0;i<n;i++)
			{
				h[i+1] = Integer.parseInt(hArray[i]);
			}
			int[] left = new int[n+1];
			int[] right = new int[n+1];
			//DP Left
			for (int i = 1; i < left.length; i++) {
				left[i] = 1;
				for(int j=i-1;j>0;j--)
				{
					if (h[i]>h[j]) {
						left[i] = Math.max(left[j]+1, left[i]);
					}
				}
			}
			//DP Right
			for (int i = n; i >0; i--)
			{
				right[i] = 1;
				for (int j = i; j < right.length; j++)
				{
					if (h[i]>h[j]) {
						right[i] =Math.max(right[j]+1, right[i]);
					}
				}
			}
			ArrayList<Integer> list = new ArrayList<Integer>();
			for(int i=0;i<n+1;i++)
			{
				list.add(left[i]+right[i]);
			}
			Collections.sort(list);
			System.out.println(n-list.get(list.size()-1)+1);
			}
	}
}
