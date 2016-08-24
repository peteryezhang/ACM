import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Scanner;

public class DicFind {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Map<String, LinkedList<String>> m = new HashMap<String, LinkedList<String>>();
		while(input.hasNext())
		{
			String dic = input.nextLine();
			String words = input.nextLine();
			String[] dicString = dic.split(" ");
			String[] wordsString = words.split(" ");
			//Init Dic
			for(int i=0;i<dicString.length;i++)
			{
				char[] tempChars = dicString[i].toCharArray();
				Arrays.sort(tempChars);
				String key = String.valueOf(tempChars);
				if (!m.containsKey(key)) {
					m.put(key, new LinkedList<String>());
					LinkedList<String> list = m.get(key);
					list.add(dicString[i]);
				}
				else {
					LinkedList<String> list = m.get(key);
					list.add(dicString[i]);
					Collections.sort(list);
				}
			}
			//Process Input words
			for(int i=0;i<wordsString.length;i++)
			{
				char[] tempChars = wordsString[i].toCharArray();
				Arrays.sort(tempChars);
				String key = String.valueOf(tempChars);
				if (m.containsKey(key)) {
					LinkedList<String> list = m.get(key);
					for (String string : list) {
						System.out.print(string);
						System.out.print(" ");
					}
					System.out.println();
				}
				else {
					System.out.println(":(");
				}
			}
		}		
	}

}
