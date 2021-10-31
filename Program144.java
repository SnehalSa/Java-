import java.util.Scanner;

class Demo
{
    public int Addition(int Brr[])
    {

       int i=0;
       int iSum=0;
       for(i=0;i<Brr.length;i++)
       {
        iSum=iSum+Brr[i];
       }  
       return iSum;


    }
}
class Program144
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
     Demo dobj=new Demo();
     int iRet=dobj.Addition(arr);
     System.out.println("Addition is :"+iRet);
     }
}