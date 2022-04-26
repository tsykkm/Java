package architecture.basic;

import architecture.basic.interfc.Fee;

public class ChildFee implements Fee {
	public Yen yen() {
		return new Yen(50);
	}

	public String label() {
		return "子供";
	}
}
