package pkg1;

public class Assignment_2
{
	
	public int sum (int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum result is" +c);
		return c;
	} 

		public int sub(int a1,int b1)
		{
			int c1;
			c1=a1-b1;
			System.out.println("Sub result is" +c1);
			return c1;
		}
		public int div(int a2,int b2)
		{
			int c2;
			c2=a2/b2;
			System.out.println("mul result is" +c2);
			return c2;
		}
		public void mul(int a3, int b3)
		{
			int c3;
			c3=a3*b3;
			System.out.println("Sun result is" +c3);
		}
		
		public static void main(String[] args)
		{
			
	     Assignment_2 result=new Assignment_2();
	     int intdiv=result.div(10, 2);
	     int intsub=result.sub(intdiv, 2);
	     int finalsub=result.sub(intsub, 2);
	     int intsum=result.sum(finalsub, 2);
	     result.mul(intsum, 2);
	     
		}
	}


