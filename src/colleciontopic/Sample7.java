package colleciontopic;

import java.util.ArrayList;

public class Sample7 {
public static void main(String[] args) {
	
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2.22);
		a1.add("Teju");
		a1.add(2.22);
		a1.add(0.0d);
		System.out.println(a1);
		if(a1.contains("Teju")){
			System.out.println("present");
		}
		else{
			System.out.println("not present");
}


}

}
