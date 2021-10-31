import java.util.Scanner;
import Number.StringX;


class Marvellous extends StringX
{
	public int CountVowel()
	{
		char Arr[]=str.toCharArray();
		int iCnt=0;
		int i=0;
		for(i=0;i<Arr.length;i++)
		{
       if((Arr[i]=='a')||(Arr[i]=='e')||(Arr[i]=='i')||(Arr[i]=='o')||(Arr[i]=='u'))
       {
       	iCnt++;
       }
 
		}
		return iCnt;
	}
}

class Program151
{
	public static void main(String arg[])
	{
		Marvellous mobj=new Marvellous();
		int iRet=0;
		mobj.Accept();
		mobj.Display();
		iRet=mobj.CountVowel();
		System.out.println("Number of Vowels are : "+iRet);

	}
}