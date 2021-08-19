package filehandlingtopic;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Sample6 {
	
	public static void main(String[] args) throws Exception {
		File f1=new File("E://rccma36.txt");
		FileWriter fr=new FileWriter(f1,true);
		BufferedWriter br=new BufferedWriter(fr);
		String []arr={"java", "maava", "Teju"};
		for(int i=0; i<arr.length;i++)
		{
			br.write(arr[i]);
			br.newLine();
		}
		br.flush();
		System.out.println("data is written");
		}
	}


