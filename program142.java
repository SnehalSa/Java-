import java.util.Scanner;
class Demo
{
	 public  boolean CheckAnstrom(int iNo)
	{
      int iCnt=0,iSum=0,iDigit=0,iTemp=0,iDigCnt=0,iPower=1;
       
      if(iNo<0)
      {
      	iNo=-iNo;
      }
      iTemp=iNo;
       while(iTemp!=0)
       { 
        iDigCnt++;
       	iNo=iNo/10;
       }
       iTemp=iNo;//we have to reset again bez above while loop it become 0;
       while(iNo!=0)
       {
       	iDigit=iTemp%10;
       	for(iCnt=1;iCnt<=iDigCnt;iCnt++)
       	{
       		iPower=iPower*iDigit;
       	}
       	iSum=iSum+iPower;
       	iPower=1;


       	iTemp=iTemp/10;

       }
       if(iSum==iNo)
       {
       	return true;
       }
       else
       {
       	return false;
       }
      



	}
		
}
class Program142
{
	
	public static void main(String arg[])
	{
       Scanner sobj=new Scanner(System.in);
		int iNo1=0;boolean bRet=false;

		System.out.println("Enter  number");
		iNo1=sobj.nextInt();

		

		Demo dobj=new Demo();
		bRet=dobj.CheckAnstrom(iNo1);
         
         if(bRet==true)
         {
		   System.out.println("It is Anstrom number");
		}
		else
		{
			 System.out.println("It is not  Anstrom number");
		}



	}
}  