package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class TwoKey {

	public TwoKey(KeyAllocator allocator) {
		allocator.label = "2";
		allocator.functionId = 1;
		allocator.status = 2;
	}

}
