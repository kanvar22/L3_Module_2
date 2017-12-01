package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.JOptionPane;

public class Decrypted {
public static void main(String[] args) {


try {
	BufferedReader br = new BufferedReader(new FileReader("src/intro_to_file_io/test2.txt"));
	String c = br.readLine();
	c = br.readLine();
	String question = JOptionPane.showInputDialog(null, "Would you like me to decrypt the file?");
	String a = c.substring(0, c.length()/2);
	String b = c.substring(c.length()/2, c.length());
	if (question.equalsIgnoreCase("yes")) {

		String s = b + a;
		System.out.println(s);
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
 //Copyright © 2017 by Kanvar Soin