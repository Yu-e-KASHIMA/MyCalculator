package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class ZeroKey {

	public ZeroKey(KeyAllocator allocator) {
		allocator.label = "0";
		allocator.functionId = 1;
		allocator.status = 0;
	}

}
