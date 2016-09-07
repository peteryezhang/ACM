import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class GreddyProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String paraString = input.nextLine();
			String[] paras = paraString.split(" ");
			int n = Integer.parseInt(paras[0]);
			int m = Integer.parseInt(paras[1]);
			String tableString = input.nextLine();
			String[] tableStrings = tableString.split(" ");
			int[] array = new int[n];
			List<Integer> list = new ArrayList<Integer>();
			//Init Table
			for (int i = 0; i < array.length; i++) {
				//array[i] = Integer.parseInt(tableStrings[i]);
				list.add(Integer.parseInt(tableStrings[i]));
			}
			Map<Float, Integer> map = new TreeMap<Float, Integer>(new Comparator<Float>()
			{
				@Override
				public int compare(Float o1, Float o2) {
					// TODO Auto-generated method stub
					return o2-o1>0 ? 1 :-1;
				}
			});
			for (int i = 0; i < m; i++) {
				String[] tempString = input.nextLine().split(" ");
				int num = Integer.parseInt(tempString[0]);
				float money = Integer.parseInt(tempString[1]);
				float key = money/num;
				map.put(key, num);
			}
			Collections.sort(list);
			//Arrays.sort(array);
			int sumMoney = 0;
			for(Map.Entry<Float, Integer> me : map.entrySet())
			{
				int num = me.getValue();
				float key = me.getKey();
				int money = (int)Math.ceil(num*key);
				if (list.size() == 0) {
					break;
				}
				for (int i = 0; i < list.size(); i++) {
					if (num<=list.get(i)) {
						sumMoney += money;
						list.remove(list.get(i));
						break;
					}
				}
			}
			System.out.println(sumMoney);

		}
	}
}
