package JavaHomeWork2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class java21readCountriesTextFile {

	public static void main(String[] args) {
	File file = new File("src\\test\\java\\JavaHomeWork2\\java21.txt");
	try {
		BufferedReader BR = new BufferedReader(new FileReader(file));
		 
		String txt;
		
		while ((txt = BR.readLine()) != null)
			System.out.println(txt);
		
		
		
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}

}
