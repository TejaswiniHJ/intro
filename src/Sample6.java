
public class Sample6 {

public static void main(String[] args) {
	System.out.println("MS");
	try{
	int i=1/2;
	int[] arr={1,2,3,4};
	
	System.out.println(arr[i]);
	}
	catch(ArithmeticException e)
	{
	System.out.println("handle");
	}
	catch(ArrayIndexOutOfBoundsException e){		
System.out.println("catch");
	}
System.out.println("ME");
}
}