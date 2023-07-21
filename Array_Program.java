package basicProgram;

public class Array_Program {

	/*public static void main(String[] args) {  */
		// TODO Auto-generated method stub
	/*	int a[]=new int[5];
		a[0]=10;
		a[1]=20;
		a[2]=50;
		a[3]=40;
		a[4]=30;

		for(int i=0; i<=a.length; i++)
		{
			System.out.println(a[i]);
		}*/
		
		
	/*	int a[]={30,40,20,50,10};
		for(int i=0;i<=a.length;i++)
		{
			System.out.println(a[i]);
		}*/
		
		
		static void min(int arr[])
		{
			int m = arr[0];
			for(int i=1; i<arr.length;i++)
			{
				if(m>arr[i])
				{
					m=arr[i];
				}
			}
			System.out.println(m);
			
		
		}
		public static void main(String abc[])
		{
			int a[]={20,3,40,50,60};
			min(a);
		}

	

}
