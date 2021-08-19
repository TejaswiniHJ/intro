package filehandlingtopic;

import java.io.File;
import java.io.FileReader;


public class Sample3 {
public static void main(String[] args) throws Exception {
	File f1=new File("E://rccma36.txt");
	FileReader fr=new FileReader(f1);
	char[] arr=new char[(int)f1.length()];
	fr.read(arr);
	String s1=new String(arr);
	System.out.println(s1);
}
}
