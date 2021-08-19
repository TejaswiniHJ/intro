package filehandlingtopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Sample4 {
public static void main(String[] args) throws IOException{

	File f1=new File("E://rccma36.txt");
	FileWriter fw=new FileWriter(f1, true);
	BufferedWriter bw=new BufferedWriter(fw);
	
	bw.write("Java");
	bw.newLine();
	bw.write("super");
	bw.flush();
	System.out.println("Data is written");
}
}

