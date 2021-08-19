package filehandlingtopic;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Sample7 {
public static void main(String[] args) throws Exception {
	File f1=new File("E:\\rccma36.jpg");
	FileInputStream fin=new FileInputStream(f1);
	byte[] arr=new byte[(int)f1.length()];
	fin.read(arr);
	for(int i=1; i<=20; i++)
	{
		FileOutputStream fout=new FileOutputStream("E:\\rccma36"+i+".jpg");
		fout.write(arr);
		fout.flush();
	}
}
}
