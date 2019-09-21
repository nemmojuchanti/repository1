
public class Static 
{
public static String name="chanti";
public int a=333;
public static void fine()
{
	System.out.println("static class "+name);
}
}
class static1
{
	public static void what()
	{
	System.out.println("static1 class...");
		}
}
class static2
{
		
	public static void main(String[] args) 
	{
		
		String same=Static.name;
		System.out.println("static is"+same);
		Static.fine();
	}}
		
		
		