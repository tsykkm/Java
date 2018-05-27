package design.facade;

public class Book {
	String book;

	//コンストラクタ
	Book (String bookName) {
		this.book = bookName;
	}

	public String getBook() {
		return book;
	}

	public void setBook(String book) {
		this.book = book;
	}
}
