package chapter7;

public class Book {
	
	public String bookName;
	public String author;
	
	public Book() {
		
	}
	
	public Book(String bookName, String author) {
		this.bookName = bookName;
		this.author = author;
	}
	
	public String getBookName() {
		return this.bookName;
	}
	
	public String getAuthor() {
		return this.author;
	}

	public void showBookInfo() {
		System.out.println(this.bookName + "1111" + this.author);
	}
}
