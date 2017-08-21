package design.iterator;

import design.iterator.interfc.Aggregate;
import design.iterator.interfc.Iterator;

public class BookShelf implements Aggregate {
	private Book[] books;
	private int num = 0;

	// 最初に本棚の大きさを指定
	public BookShelf(int maxSize) {
		this.books = new Book[maxSize];
	}

	public Book getBookAt(int index) {
		return books[index];
	}

	// 本棚に書籍を入れる
	public void appendBook(Book book) {
		this.books[num] = book;
		num++;
	}

	public int getLength() {
		return num;
	}

	public Iterator iterator() {
		return new BookShelfIterator(this);
	}
}
