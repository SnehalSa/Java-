import java.util.Scanner;
import MarvellousNumbers.ArrayX;

class Marvellous extends ArrayX//incomplete
{
   public Marvellous(int iValue)
   {
      super(iValue);
   }
   public float Average()
   {
      int iSum=0,iCnt=0;
      for(iCnt=0;iCnt<Arr.length;iCnt++)
      {
         iSum=iSum+Arr[iCnt];
      }
      return (iSum/Arr.length);
   }
}


class Program147
{
	public static void main(String arg[])
	{
      Scanner sobj=new Scanner(System.in);
      System.out.println("Enter size of array");
      int iLength=0;
      iLength=sobj.nextInt();
     Marvellous mobj=new Marvellous(iLength);//constructor call hoto
     mobj.Accept();
     mobj.Display();
     float fRet=0.0;
     float fRet=mobj.Average();
      System.out.println("Average is :"+fRet);

    

    }
 }