
public class SwitchTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String chanti1="chanti";
	String chanti2="chary";
	switch(chanti1)
	
{
	case "chary":
		System.out.println("congrts");
		break;
		
	case "c":
		System.out.println("hello");
		break;
	default:
		System.out.println("byee");
break;
	
	case "chanti":
	{
		switch(chanti2)
		{
		case "chary":
			System.out.println("chary string2");
			break;
		case "chanti":
			System.out.println("chanti");
			break;
		}
	}
System.out.println("haii");
break;
	
	
	}
	System.out.println("byee2");
	
	}

}
