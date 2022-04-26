package design.iterator;

import design.iterator.interfc.Iterator;

public class Main {
	public static void main(String[] args) {
		// create bookshelf
		BookShelf bs = new BookShelf(4);
		bs.appendBook(new Book("book-A"));
		bs.appendBook(new Book("book-B"));
		bs.appendBook(new Book("book-C"));
		bs.appendBook(new Book("book-D"));
		// Iterator's instance
		Iterator it = bs.iterator();
		// iterate
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
