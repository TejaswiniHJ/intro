package filehandlingtopic;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample2 {
public static void main(String[] args) throws IOException{
	File f1=new File("E://rccma36.txt");
		FileWriter fw=new FileWriter(f1);
		fw.write("Hello");
		fw.flush();
		System.out.println("data written");
}
}
