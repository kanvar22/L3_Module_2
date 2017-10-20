package intro_to_file_io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaLevel3CopyrigthProgram {
public static void main(String[] args) {
	try {
		File folder = new File("src/intro_to_file_io");
		File[] listOfFiles = folder.listFiles();

		    for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile() && listOfFiles[i].getName().endsWith(".java")) {
		        System.out.println("File " + listOfFiles[i].getName());
		    	try {
		    		FileWriter fw = new FileWriter(listOfFiles[i], true);
		    		
		    		/*
		    		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		    		      FileWriter constructor.
		    		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		    		*/
		    		
		    		fw.write("\n //Copyright © 2017 by Kanvar Soin");
		    			
		    		fw.close();
		    	
		    	}catch (IOException e) {
		    		e.printStackTrace();
		    	}
		      }else if (listOfFiles[i].isDirectory()) {
		        System.out.println("Directory " + listOfFiles[i].getName());
		      }
		    }
		FileReader fr = new FileReader("src/intro_to_file_io/test.txt");
		int c = fr.read();
		while(c != -1){
			System.out.print((char)c);
			c = fr.read();
			
		}
		fr.close();
	} catch (FileNotFoundException e) {
		e.printStackTrace();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//Read from a file one line at a time
	try {
		BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test.txt"));
		
		String line = br.readLine();
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

 //Copyright © 2017 by Kanvar Soin