package basicProgram;

import java.util.Scanner;


public class Prime_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the choice of number");
		int a= sc.nextInt();
		boolean p=false;
		for(int i=2;i<=(a-1);i++)
		{
		//	System.out.println(a);
			if(a%i==0)
			{
				p=true;
			}
		}
		if(p==true)
		{
			System.out.println("not prime");
		}
		else
		{
			System.out.println(" prime");
		}
		sc.close();
	}
}
