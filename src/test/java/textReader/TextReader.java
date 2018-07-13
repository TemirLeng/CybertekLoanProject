package textReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TextReader {

	public static void main(String[] args) {
		String path = "C:\\Users\\Elturan\\eclipse-workspace\\testing-automation\\textData.txt";
		File file = new File (path);
		try {
			FileReader fileReader = new FileReader(file);
			BufferedReader read = new BufferedReader(fileReader);
			String line1 = read.readLine();
			
			while (line1 != null) {
				System.out.println("print: " + line1);
				line1 = read.readLine();
			}
			//String line2 = read.readLine();
			System.out.println("this is the first line: " + line1);
			//System.out.println("this is the second line: " + line2);
		} catch (IOException e) {
			System.out.println(path + " not found!");
			e.printStackTrace();
		}
		
	}

}
