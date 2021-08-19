package colleciontopic;

import java.util.ArrayList;

public class Sample3 {


public static void main(String[] args) {
	
		ArrayList a1=new ArrayList();
		a1.add(1);
		a1.add(2.22);
		a1.add("Teju");
		System.out.println(a1);
		ArrayList a2=new ArrayList();
		a2.add('T');
		a2.add("123ab");
		a2.add(0.0d);
		System.out.println(a2);
		a2.addAll(1,a1);
		System.out.println(a1);
		System.out.println(a2);
	}
}

