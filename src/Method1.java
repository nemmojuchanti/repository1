
class Method2 {

	public int write=3;
	public int nmbr=5;
	static String read="selinium";
	public void demo()
	{
		System.out.println(write+"   " +read);
		
	}
	public static void process()
	{
		System.out.println("resp is..."+read);
	}
}
public class Method1
{
public static void main(String[] chanti)	
{
Method2 md=new Method2();
//String resp=md.read;
System.out.println("res is  "+md.read);
md.demo();
Method2.process();
//int nmbr1=md.nmbr;
//System.out.println("num is  "+nmbr1);
System.out.println(md.nmbr+"  num is..."+md.write);




}
}
