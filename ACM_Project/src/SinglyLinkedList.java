import java.util.LinkedList;
import java.util.Scanner;

public class SinglyLinkedList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext())
		{
			int n = Integer.parseInt(input.nextLine());
			int head = Integer.parseInt(input.nextLine());
			LinkedList<Integer> list = new LinkedList<Integer>();
			list.add(head);
			for (int i = 0; i < n-1; i++) {
				String str = input.nextLine();
				String[] strArray = str.split(" ");
				int newNum = Integer.parseInt(strArray[0]);
				if (list.contains(newNum)) {
					continue;
				}
				int oldNum = Integer.parseInt(strArray[1]);
				int index = list.indexOf(oldNum);
				if (index != -1) {
					list.add(index+1, newNum);										
				}
			}
			Integer removeNum = input.nextInt();
			list.remove(removeNum);
			for(Integer temp : list)
			{
				System.out.print(temp);		
				System.out.print(" ");				
			}
			System.out.println();
		}
	}
}
