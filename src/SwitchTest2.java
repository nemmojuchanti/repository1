
public class SwitchTest2 
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwitchTest22 st=new SwitchTest22();
		st.frst();
		String kingofforest="lion";
		switch(kingofforest)
		{
		case ("elephant"):
			System.out.println("elephant");
		break;
		case ("lion"):
			System.out.println("king of forest");
		break;
		}
		
	}
}
class SwitchTest22
{
	public void frst()
	{
 String forest="animals";
	switch(forest)
	{
	case "tiger":
		System.out.println("runner");
		break;
	case "animals":
	System.out.println("forest");
	break;
	}

	System.out.println("forest456");
	}

}
