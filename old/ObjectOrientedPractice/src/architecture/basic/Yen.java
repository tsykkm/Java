package architecture.basic;

public class Yen {
	private int yen;

	Yen(int value) {
		if (value < 0) {
			throw new IllegalArgumentException("Minus Yen doesn't exist!");
		} else if (value > 2147483647) {
			throw new IllegalArgumentException("Over integer range!");
		}
		yen = value;
	}

	public int getYen(){
		return yen;
	}
}
