import java.util.Scanner;

class Marvellous
{
   public void Display(String Data)
   {
   	 System.out.println("Hello : "+Data);
   }
}
class Program149
{
	public static void main(String arg[])
	{
		String str;
		Scanner sobj=new Scanner(System.in);
		System.out.println("Enter your name");
		 str=sobj.nextLine();
		
		 Marvellous mobj=new Marvellous();
		 mobj.Display(str);
	}
}