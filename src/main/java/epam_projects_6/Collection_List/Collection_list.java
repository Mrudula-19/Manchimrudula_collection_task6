package epam_projects_6.Collection_List;
import java.lang.*;
import java.util.*;
class C_List
{
	public void method(ArrayList<Integer> list)
    {
	    Scanner sc=new Scanner(System.in);
	    while(true)
	    {
	        System.out.println("CHOOSE:");
	        System.out.println("1.Fetch:");
	        System.out.println("2.Add:");
	        System.out.println("3.Delete:");
	        System.out.println("4.Display:");
	        System.out.println("5.Quit:");
	        System.out.print("Your Choice:");
	        int k=sc.nextInt();
	        switch(k)
	        {
	        case 1:
	        {
	            System.out.print("Enter the index:");
	            int value=sc.nextInt();
	            System.out.println("Value at the position "+value+" is : "+list.get(value));
	            break;
	        }
	        case 2:
	        {
	            System.out.print("Enter the element:");
	            int value=sc.nextInt();
	            list.add(value);
	            System.out.println("Arraylist Elements are:"+list);
	            break;
	        }
	        case 3:
	        {
	            System.out.print("Enter the index:");
	            int value=sc.nextInt();
	            int ele=list.get(value);
	            System.out.println("The element delected is: "+ele);
	            list.remove(value);
	            break;
	        }
	        case 4:
	        {
	            System.out.println("Arraylist Elements are:"+list);
	            break;
	        }
	        case 5:
	        {
	            System.out.println("QUIT");
	            System.exit(0);
	            break;
	        }
	        }
	    }
    }
}
public class Collection_list 
{
	public static void main(String args[])
    {
        ArrayList<Integer> elements = new ArrayList<Integer>(Arrays.asList(19,03,20,14,04,28,17,37,50,68,99,33));
        C_List c=new C_List();
        c.method(elements);
    }
}