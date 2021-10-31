import java.util.Scanner;
class Demo
{
	 public  boolean CheckPrime(int i)
	{
		int iCnt=0;

		for(iCnt=2;iCnt<=i/2;iCnt++)//2 is compulsary
		{
			if((i%iCnt)==0)
			{

				break;
		    }
		}
		if(i%iCnt==0)
		{
			return false;
		}
		else
		{
		   return true;
		}
		
	    
	}
}
class Program141
{
	
	public static void main(String arg[])
	{
       Scanner sobj=new Scanner(System.in);
		int iNo1=0;boolean bRet=false;

		System.out.println("Enter  number");
		iNo1=sobj.nextInt();

		

		Demo dobj=new Demo();
		bRet=dobj.CheckPrime(iNo1);
         
         if(bRet==true)
         {
		   System.out.println("It is prime number");
		}
		else
		{
			 System.out.println("It is not  prime number");
		}



	}
}  