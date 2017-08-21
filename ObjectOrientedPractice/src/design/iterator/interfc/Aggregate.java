package design.iterator.interfc;

/**
 * 持っている要素を順番にスキャンする
 *
 */
public interface Aggregate {
	// AggregateクラスがIteratorを生成する
	public abstract Iterator iterator();
}
