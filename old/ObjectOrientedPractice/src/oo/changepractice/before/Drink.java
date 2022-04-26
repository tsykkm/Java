package oo.changepractice.before;

public class Drink {

    public static final int COKE = 0;
    public static final int DIET_COKE = 1;
    public static final int TEA = 2;

	private int drink;

	//コンストラクタ
	Drink(int drink) {
		this.drink = drink;
	}

	public int getDrink() {
		return this.drink;
	}
}
