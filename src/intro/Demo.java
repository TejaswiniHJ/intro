package intro;

public class Demo {
	public static void main(String[] args) {
		int[]arr={1,23,45,50};
		int find=23;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]==find)
			{
				System.out.println("found");
			}
				else
				{
					System.out.println("not found");
			}
		}
	}

}
