import java.util.Scanner;
class Demo
{
	public int Addition(int i,int j)
	{
	int iResult=0;
		iResult=i+j;
		return iResult;
	}
}
class Program140
{
	
	public static void main(String arg[])
	{
       Scanner sobj=new Scanner(System.in);
		int iNo1=0,iNo2=0,iAns=0;

		System.out.println("Enter first number");
		iNo1=sobj.nextInt();

		System.out.println("Enter secound number");
		iNo2=sobj.nextInt();

		Demo dobj=new Demo();
		iAns=dobj.Addition(iNo1,iNo2);

	

		System.out.println("Addition is:"+iAns);



	}
}  