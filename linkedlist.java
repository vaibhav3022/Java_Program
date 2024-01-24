import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of friends:");
		int n=sc.nextInt();
		LinkedList<String> list=new LinkedList<>();
		System.out.println("Enter Friends name:");
		for(int i=0;i<n;i++)
		{
			list.add(sc.next());
		}
		System.out.println("Linked list elements="+list);
		
	}

}
