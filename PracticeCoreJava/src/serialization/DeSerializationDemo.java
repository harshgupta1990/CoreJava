package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DeSerializationDemo {

	public static void main(String[] args) {
		
		File file = new File("C:\\Users\\harsh\\git\\CoreJava\\PracticeCoreJava\\src\\serialization\\data.txt");
		
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			Student s = (Student) ois.readObject();
			
			System.out.println(s.getName() + "--" + s.getRoll());
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
