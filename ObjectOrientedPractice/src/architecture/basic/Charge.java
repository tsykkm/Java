package architecture.basic;

import architecture.basic.interfc.Fee;

public class Charge {
	Fee fee;

	Charge(Fee fee) {
		// adult, childどちらの型でもよい
		this.fee = fee;
	}

	Yen yen() {
		return fee.yen();
	}
}
