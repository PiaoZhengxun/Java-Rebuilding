package chapter12;

public class Student {
	
	private String number;
	private String name;
	
	public Student(String number, String name) {
		this.name = name;
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return Integer.parseInt(number);
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(this.number == s.number) {
				return true;
			} else {
				return false;
			}
		}
		return false;
	}
	
	@Override
	public String toString() {
		return number + ":" + name;
	}
}
