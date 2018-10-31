package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class MemoryClearKey {

	public MemoryClearKey(KeyAllocator allocator) {
		allocator.label = "MC";
		allocator.functionId = 4;
		allocator.status = 2;
	}

}
