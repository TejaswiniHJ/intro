package intro;

public class Pattern {


public static void main(String[] args) {

	int star=4;
	int space=0;
	for (int i=1; i<=4; i++)
	{
		int no=4;
		
		for(int j=1; j<=space; j++)
		{
			System.out.print(" ");
		}
			for(int k=4; k>=star; k--)
			{
				System.out.print("no");
				no--;
			}
		
			System.out.println();
			
	star--;
	space++;
   
	
}

}
}



