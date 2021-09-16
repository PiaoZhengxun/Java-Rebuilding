package chapter15;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Person implements Serializable {
	

	private static final long serialVersionUID = 6574463917560550623L;
	
	String name;
	transient String job;
	
	public Person() {
		
	}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	public String toString() {
		return name + job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person personPark = new Person("박정훈", "사장");
		Person personLee = new Person("이재용", "회장");
		
		try(FileOutputStream fos = new FileOutputStream("serial.out");
				ObjectOutputStream oos = new ObjectOutputStream(fos)){
			oos.writeObject(personPark);
			oos.writeObject(personLee);
		} catch(IOException e) {
			e.printStackTrace();
		}
		
		try(FileInputStream fis = new FileInputStream("serial.out");
				ObjectInputStream ois = new ObjectInputStream(fis)){
			Person pp1 = (Person)ois.readObject();
			Person pp2 = (Person)ois.readObject();
			System.out.println(pp1);
			System.out.println(pp2);
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}
