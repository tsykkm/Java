package architecture.basic;

import architecture.basic.interfc.Fee;

public class AdultFee implements Fee  {
	public Yen yen() {
		return new Yen(100);
	}

	public String label() {
		return "大人";
	}
}
