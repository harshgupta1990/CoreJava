package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {
		
		Student s1 = new Student(123, "Harshit");
		
		File file = new File("C:\\Users\\harsh\\git\\CoreJava\\PracticeCoreJava\\src\\serialization\\data.txt");
		
		
				try {
						FileOutputStream fos = new FileOutputStream(file);
						ObjectOutputStream oos = new ObjectOutputStream(fos);
						oos.writeObject(s1);
						
						oos.close();
						fos.close();
						
					} catch (FileNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
				
	}

}
