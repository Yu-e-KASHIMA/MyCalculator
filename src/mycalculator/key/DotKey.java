package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class DotKey {

	public DotKey(KeyAllocator allocator) {
		allocator.label = ".";
		allocator.functionId = 1;
		allocator.status = 10;
	}

}
