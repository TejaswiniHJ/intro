package strcls;

public class Sample {
	public static void main(String[] args) {
		String s1="hii";
		String s2="hii";
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		String s3=new String("Tej");
		String s4=new String("Tej");
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
	}

}
