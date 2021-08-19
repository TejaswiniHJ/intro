package filehandlingtopic;

import java.io.File;

public class Sample {
	public static void main(String[] args) {
		
	File f1=new File("E:\\rccma36filehandling");
	if(f1.mkdirs()){
		System.out.println("folder created");
	}
	else {
		System.out.println("folder not created");
	}
	if(f1.exists()){
		System.out.println("File exists");
	}
	else{
		System.out.println("File not exists");
	}
	if(f1.delete()){
		System.out.println("file is deleted");
	}
	else{
		System.out.println("file not deleted");	
	}
	}

}
