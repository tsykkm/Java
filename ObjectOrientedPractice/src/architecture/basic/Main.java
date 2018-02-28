package architecture.basic;

import architecture.basic.interfc.Fee;

public class Main {

	public static void main(String[] args) {
		// 各種料金生成
		Fee adultFee = new AdultFee();
		Fee childFee = new ChildFee();
		Charge entryCharge = new Charge(adultFee);

		System.out.println(entryCharge.yen());
	}
}
