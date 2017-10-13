package intro_to_file_io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Decrypted {
public static void main(String[] args) {
	
}
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

