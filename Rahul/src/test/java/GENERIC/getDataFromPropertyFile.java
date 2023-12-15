package GENERIC;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class getDataFromPropertyFile implements Framework_constants{
	public static String getdata(String key) throws IOException
	{
		FileInputStream fis= new FileInputStream(property_path);
		Properties prop= new Properties();
		prop.load(fis);
		 String value = prop.getProperty(key);
		return value;
	}

}
