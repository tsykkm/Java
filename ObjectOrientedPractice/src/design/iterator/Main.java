package design.iterator;

import design.iterator.interfc.Iterator;

public class Main {
	public static void main(String[] args) {
		// 本棚生成
		BookShelf bs = new BookShelf(4);
		bs.appendBook(new Book("book-A"));
		bs.appendBook(new Book("book-B"));
		bs.appendBook(new Book("book-C"));
		bs.appendBook(new Book("book-D"));
		// 本棚をスキャンするためのIteratorのインスタンス
		Iterator it = bs.iterator();
		// スキャン
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}
	}
}
