package objectclasstopic;

public class Sample {
public static void main(String[] args) {
	System.out.println("ME");
	try{
	int i=1/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println("handled");
	}
	System.out.println("ME");
}
}
