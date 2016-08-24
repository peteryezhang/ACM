import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class EchoNumProblem {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Map<Integer, Integer> m = new HashMap<Integer, Integer>();
		while(input.hasNext())
		{
			int n = input.nextInt();
			int key = get_next(n);
			while(true)
			{
				if (!m.containsKey(key)) {
					m.put(key, 1);
					key = get_next(key);
				}
				else {
					System.out.print(key);
					break;
				}				
			}

		}
	}
	
	static int get_next(int x)
	{
		String s = String.valueOf(x);
		char[] carray = s.toCharArray();
		Arrays.sort(carray);
		int minInt = Integer.parseInt(String.valueOf(carray));
		StringBuffer sb= new StringBuffer(String.valueOf(carray));
		int maxInt = Integer.parseInt(String.valueOf(sb.reverse()));
		return maxInt - minInt;

	}
}
