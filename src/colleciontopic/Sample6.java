package colleciontopic;

import java.util.ArrayList;

public class Sample6 {
public static void main(String[] args) {
	
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2.22);
		a1.add("Teju");
		a1.add(2.22);
		a1.add(0.0d);
		for(int i=0; i<a1.size(); i++)
		{
		System.out.println(a1.get(1));
		}
}


}
