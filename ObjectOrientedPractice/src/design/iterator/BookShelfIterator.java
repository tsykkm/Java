package design.iterator;

import design.iterator.interfc.Iterator;

/**
 * Scan books on BookShelf
 *
 */
public class BookShelfIterator implements Iterator {

	// スキャンする本棚
	private BookShelf bookShelf;
	// number of books
	private int index;

	public BookShelfIterator(BookShelf bookShelf) {
		this.bookShelf = bookShelf;
		this.index = 0;
	}

	public boolean hasNext() {
		if (index < bookShelf.getLength()) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * return aggregation element
	 * @return book
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
