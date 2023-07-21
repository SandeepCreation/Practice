package basicProgram;

public class Fibonacci_Series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner sc= new Scanner(System.in);
		//int j=sc.nextInt();
		int a=0,i=1;
		for(int b=0; b<=6; b++)
		{
			int c=a+i;
			System.out.println(a);
			a=i;
			i=c;
		}
	
	}

}
