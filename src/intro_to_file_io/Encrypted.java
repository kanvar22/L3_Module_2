package intro_to_file_io;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Encrypted {
public static void main(String[] args) {
	String question = JOptionPane.showInputDialog(null, "Name something that has a even number of letters.");
	String a = question.substring(0, question.length()/2);
	String b = question.substring(question.length()/2, question.length());
	String s = b + a;
	System.out.println(s);
	try {
		FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt");
		
		/*
		NOTE: To append to a file that already exists, add true as a second parameter when calling the
		      FileWriter constructor.
		      (e.g. FileWriter fw = new FileWriter("src/intro_to_file_io/test2.txt", true);)
		*/
		
		fw.write("\n" + s);
			
		fw.close();
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	//Using a file chooser
	JFileChooser jfc = new JFileChooser();
	int returnVal = jfc.showOpenDialog(null);
	if (returnVal == JFileChooser.APPROVE_OPTION) {
		String fileName = jfc.getSelectedFile().getAbsolutePath();
		System.out.println(fileName);
	}
}
}


 //Copyright © 2017 by Kanvar Soin
 //Copyright © 2017 by Kanvar Soin