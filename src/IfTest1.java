
public class IfTest1 {
	public static void direct() {
		System.out.println("direct calling");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=7;
		if (a==b)
			System.out.println("if is correct");
		else
			System.out.println("else is correct");
Test.operation();
direct();
	}

}
class Test
{
	public static void operation()
	{
int c=3,d=8;
	if (c>=d)
		System.out.println("tect class "+c);
	else 
		System.out.println("tests class is "+d);
		Test ts=new Test();
		ts.oper();
	}
public void oper()
{
	System.out.println("dummy");
	}
}