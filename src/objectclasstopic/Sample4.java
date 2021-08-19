package objectclasstopic;

public class Sample4 {

public static void main(String[] args) {
	System.out.println("MS");
	
	try{
	int a=1/0;
	System.out.println("abc");
	}
	catch(ArithmeticException e)
	{
	System.out.println("catch");
	}
System.out.println("ME");
}
}