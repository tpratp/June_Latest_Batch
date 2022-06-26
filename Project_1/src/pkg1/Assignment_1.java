package pkg1;
//(((10+2)+2)-2)*2)/2)
public class Assignment_1
{
public int sum1(int a,int b)
{
	int s1;
	s1=a+b;
	System.out.println("Sun result is" +s1);
	return s1;
} 

	public int sub1(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("Sub result is" +c);
		return c;
	}
	public int mul(int a1,int b1)
	{
		int m;
		m=a1*b1;
		System.out.println("mul result is" +m);
		return m;
	}
	public void div(int a2, int b2)
	{
		int d;
		d=a2/b2;
		System.out.println("Sun result is" +d);
	}
	
	public static void main(String[] args)
	{
		
     Assignment_1 result=new Assignment_1();
     int intsum1=result.sum1(10, 2);
     int intsum2=result.sum1(intsum1, 2);
     int subresult=result.sub1(intsum2, 2);
     int mulresult=result.mul(subresult, 2);
     result.div(mulresult, 2);
     
	}
}
