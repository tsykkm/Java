package architecture.basic;

import java.util.ArrayList;
import java.util.List;

import architecture.basic.interfc.Fee;

public class Reservation {
	List<Fee> fees; //大人と子供の料金内訳は不明

	Reservation() {
		fees = new ArrayList<Fee>();
	}

	void addFee(Fee fee) {
		fees.add(fee);
	}

	Yen feeTotal() {
		Yen total = new Yen();
		for(Fee each : fees) {
			total.add(each.yen());
		}
		return total;
	}
}
