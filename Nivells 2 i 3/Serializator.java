package exercice1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class Serializator {
	
	/**
	 * @return void: This method serialize an arrayList to .json 
	 * @param Menu
	 */
	public static void SerializeArrayList(ArrayList<String> Menu) {
		
		for (Method method: App.class.getDeclaredMethods()) {
			if(method.isAnnotationPresent(SerializeToJson.class)) {
				
	            // Retrieve the annotation and its values using reflection
				SerializeToJson annotation = method.getAnnotation(SerializeToJson.class);
				String path = annotation.destination();
				
	            // Log the annotation values by printing them to the console
	            System.out.println("Annotation found: destination = " + path);
				
				
				try {
					
					ObjectOutputStream myWriter = 
							new ObjectOutputStream(new FileOutputStream(path));
					myWriter.writeObject(Menu);
					myWriter.close();
					
				} catch (FileNotFoundException e) {	
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				} 		
			}
			
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


}
