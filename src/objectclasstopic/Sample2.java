package objectclasstopic;

public class Sample2 {

public static void main(String[] args) {
	System.out.println("MS");
	
	Sample2 s1=null;
	try
	{
	System.out.println(s1.hashCode());
	}
	catch(NullPointerException e)
	{
	System.out.println("catch");

}

}
}