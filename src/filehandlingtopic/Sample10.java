package filehandlingtopic;

import java.io.File;

public class Sample10 {
public static void main(String[] args) {
	File f1=new File("E:\\dinga//dingi//ja//qsp");
	System.out.println(f1.mkdirs());
	System.out.println(f1.getAbsolutePath());
	System.out.println(f1.getParent());
	System.out.println(f1.getName());
	System.out.println(f1.getPath());
	System.out.println(f1.getClass());
}
}
