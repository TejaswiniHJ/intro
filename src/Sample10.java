
public class Sample10 {

public static void main(String[] args) {
	System.out.println("MS");
	try{
	int i=1/10;
	System.out.println(i);
	}
	catch(Exception e)
	{
	System.out.println("handled");
	}
	//catch(ArithmeticException e)
	//{
	//System.out.println("catch");
	//}
System.out.println("ME");
}
}

