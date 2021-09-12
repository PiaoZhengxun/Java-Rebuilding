package chapter7;

import java.util.ArrayList;

public class ArrayListText {
	
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("��", "��"));
		library.add(new Book("��1", "��1"));
		library.add(new Book("��2", "��2"));
		library.add(new Book("��3", "��3"));
		library.add(new Book("��4", "��4"));
		
		for(int i = 0; i < library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		System.out.println();
		
		System.out.println("enhanced for");
		
		for(Book book: library) {
			book.showBookInfo();
		}
	}

}
