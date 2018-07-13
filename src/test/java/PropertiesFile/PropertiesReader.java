package PropertiesFile;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesReader {
	
	private static Properties pr;
	
	static {
		String path = "C:\\Users\\Elturan\\eclipse-workspace\\testing-automation\\Config.properties";
		try {
			FileInputStream file = new FileInputStream(path);
			pr = new Properties();
			pr.load(file);
			file.close();
		} catch (IOException e) {
			System.out.println(path + "File does not found!");
			e.printStackTrace();
		}
	}
	
	public static String getValue(String key) {
		return pr.getProperty(key);

	}
	

}
