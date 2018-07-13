package textReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

// .txt
//.doc
//.pdf
//.xls
//.properties

public class PropertiesReader {

	public static void main(String[] args){
		String path = "C:\\Users\\Elturan\\eclipse-workspace\\testing-automation\\Configuration.properties";
		try {
			FileInputStream file = new FileInputStream(path);
			Properties pr = new Properties();
			pr.load(file);
			String j = pr.getProperty("CEO");
			System.out.println(j);
		} catch (IOException e) {
			System.out.println("File is not found!");
			e.printStackTrace();
		}
	}

}
