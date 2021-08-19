package programs;

public class Sample {
public static void main(String[] args) {
	int count=0;
	String s1="catdogcatdog";
	
	for(int i=0; i<s1.length()-2; i++)
	{
		String ch=s1.substring(i,i+3);
		if(ch.equals("cat"))
		{
			count++;
			
		}
	}
		System.out.println(count);
	}
}


