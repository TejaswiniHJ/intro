
public class Sample7 {

public static void main(String[] args) {
	System.out.println("MS");
	try{
	int i=1/0;
	}
	catch(ArithmeticException e)
	{
	System.out.println("handle");
	}
	finally{		
System.out.println("database got closed");
	}
System.out.println("ME");
}
}