package chapter7;

import java.util.ArrayList;

public class ArrayListText {
	
	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		
		library.add(new Book("聪", "决"));
		library.add(new Book("聪1", "决1"));
		library.add(new Book("聪2", "决2"));
		library.add(new Book("聪3", "决3"));
		library.add(new Book("聪4", "决4"));
		
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
