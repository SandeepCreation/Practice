package basicProgram;

import java.util.Scanner;

public class Palindrome_Number {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("give the number which you want for palindrome");
		int a=sc.nextInt();
		int y=0,x=0;
		int b=a;
		for(; a>=1;)
		{
			y=a%10;
			a=a/10;
			x=x*10+y;
		}
		System.out.println("the given value is: "+b);
		System.out.println("the output is: "+x);
		if(b==x)
		{
			System.out.println("the given number is palindrome");
		}
		else
		{
			System.out.println("the not palindrome");
		}
		sc.close();
	}
}
