import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;

public class MingMingsRandom {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int num = Integer.valueOf( input.nextLine());
			Map<Integer, Integer> m = new TreeMap<Integer, Integer>();
			for (int i = 0; i < num; i++) {
				int tempNum = Integer.valueOf( input.nextLine());
				if (!m.containsKey(tempNum)) {
					m.put(tempNum, 1);
				}
		        }
				Map<Integer, Integer> mNew = new TreeMap<Integer, Integer>();
				mNew.putAll(m); 
		        for (Entry<Integer, Integer> entry : mNew.entrySet()) {  
		            System.out.println(entry.getKey()); 
			}
		}
	}
}
