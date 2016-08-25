import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

public class StringSort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			String s = input.nextLine();
			char[] sc= s.toCharArray();
			LinkedList<Character> list = new LinkedList<Character>();
			for(Character temp : sc)
			{
				if (Character.isLetter(temp)) {
					list.add(temp);
				}
			}

			Collections.sort(list, new Comparator<Character>()
					{
						@Override
						public int compare(Character o1, Character o2) {
							return Character.toLowerCase(o1)-Character.toLowerCase(o2);
						}
					});
			StringBuilder sb = new StringBuilder();
			int i=0;
			for(Character temp : sc)
			{
				if (Character.isLetter(temp)&& i<list.size()) {
					sb.append(list.get(i));
					i++;
				}
				else {
					sb.append(temp);
				}
			}
			System.out.println(sb.toString());
		}
	}
}
