package filehandlingtopic;

import java.io.File;
import java.io.IOException;

public class Sample1 {
public static void main(String[] args)  throws IOException
{
File f1=new File("E://rccma36.txt");
if(f1.createNewFile()){
	System.out.println("file created");
}
else{
	System.out.println("file not created");
}
}
}
