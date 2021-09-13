package chapter12;

import java.util.HashSet;

public class StudentTest {
	
	public static void main(String[] args) {
		
		HashSet<Student> set = new HashSet<Student>();
		
		set.add(new Student("100", "ȫ1�浿"));
		set.add(new Student("200", "ȫ2�浿"));
		set.add(new Student("300", "ȫ3�浿"));
		set.add(new Student("400", "ȫ4�浿"));
		
		System.out.print(set);
		
	}

}
