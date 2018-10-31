package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class SquareRootKey {

	public SquareRootKey(KeyAllocator allocator) {
		allocator.label = "√";
		allocator.functionId = 3;
		allocator.status = 2;
	}

}
