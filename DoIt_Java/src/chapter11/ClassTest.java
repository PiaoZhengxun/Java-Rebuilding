package chapter11;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ClassTest {
	
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		Class pClass3 = Class.forName("chapter11.Person");
		System.out.println(pClass3.getName());
		
		Class checkClass = Class.forName("chapter11.Person");
		
		Constructor[] c = checkClass.getConstructors();
		Field[] f = checkClass.getFields();
		Method[] m = checkClass.getMethods();
		
		for(Constructor a: c) {
			System.out.println(c);
		}
		for(Field b : f) {
			System.out.println(b);
		}
		for(Method q : m) {
			System.out.println(q);
		}
	}

}
