
public class Sample8 {

public static void main(String[] args) {
	System.out.println("MS");
	try{
	int i=1/0;
	}
	catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("catch");
	}
	catch(ArithmeticException e)
	{
	System.out.println("handle");
	}
System.out.println("ME");
}
}
