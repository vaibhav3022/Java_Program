import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class sorted {

	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no.of int");
	 int n=sc.nextInt();
	 LinkedList<Integer> list=new LinkedList<Integer>();
	 System.out.println("Enter integers:");
	 for(int i=0;i<n;i++)
	 {
		 list.add(sc.nextInt());
	 }
	 System.out.println("Linkedlist Integer:"+list);
	 
	 Collections.sort(list);
	 
	 System.out.println("Sorted Elements are:"+list);
	}

}
