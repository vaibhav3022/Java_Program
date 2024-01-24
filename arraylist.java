import java.util.ArrayList;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		//arraylist
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of cities:");
		int n=sc.nextInt();
		ArrayList<String> list=new ArrayList<String>();
		System.out.println("Enter cities:");
		for(int i=0;i<n;i++)
		{
		  list.add(sc.next());
		}
		System.out.println("Arraylist Elements is"+list);
		
	   //remove all element from this list
		list.removeAll(list);
		System.out.println("After Remove Element:"+list);
		
	}

}
