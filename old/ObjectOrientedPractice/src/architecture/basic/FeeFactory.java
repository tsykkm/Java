package architecture.basic;

import java.util.Map;

import architecture.basic.interfc.Fee;

public class FeeFactory {
	static Map<String, Fee> types;

	static {
		types.put("adult", new AdultFee());
		types.put("adult", new ChildFee());
	}

	static Fee feeByName(String name) {
		return types.get(name);
	}


}
