package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class ReadPropertyFiles {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		Properties test= new Properties();
		FileInputStream ip= new FileInputStream(new File("C:\\magnum\\VimanNagar\\src\\test\\test.properties"));
		test.load(ip);;
		
		System.out.println(test.getProperty("url"));
		
		Set<Object> keys=test.keySet();
		Iterator it= keys.iterator();
		
		while(it.hasNext()){
			
			String key= it.next().toString();
			System.out.println(key+" : "+test.getProperty(key));
		}
		
		
		
		
		
		
		
	}

}
