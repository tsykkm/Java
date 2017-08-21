package design.iterator;

import design.iterator.interfc.Iterator;

/**
 * 本棚の本をスキャンする
 * Iteratorとして扱うため、Iteratorインターフェースを実装
 */
public class BookShelfIterator implements Iterator {

	// スキャンする本棚
	private BookShelf bookShelf;
	// 冊数
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
	 * 集合体の要素(本)を一つ返す
	 * @return 本
	 */
	public Object next() {
		Book book = bookShelf.getBookAt(index);
		index++;
		return book;
	}
}
