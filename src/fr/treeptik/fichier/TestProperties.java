package fr.treeptik.fichier;

import java.io.FileReader;
import java.util.Properties;

public class TestProperties {

	public static void main(String[] args) throws Exception{
		Properties properties = new Properties();
		FileReader fileReader = new FileReader("conf.properties");
		properties.load(fileReader);
		
		System.out.println(properties.getProperty("database.user"));

	}

}
