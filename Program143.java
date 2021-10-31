import java.util.Scanner;

class Program143
{
	public static void main(String arg[])
	{
		
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter size of array");
      int iSize=sobj.nextInt();
      int arr[]=new int[iSize];

      System.out.println("Enter elements of array");

      int i=0;
      for(i=0;i<arr.length;i++)
      {
      	arr[i]=sobj.nextInt();
      }
      System.out.println("Enter elements are");
      for(i=0;i<arr.length;i++)
      {
      	System.out.println(arr[i]);
      }

	}
}