import java.util.Scanner;

//Input:String
//Output:String中最小重复周期
public class EchoString {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String s = input.nextLine();
			int i=0;
			for(i = 1;i<s.length();i++)
			{
				if (s.indexOf(s.substring(0, i)) == -1) break;
			}
			System.out.print(i);
		}		
	}

}
