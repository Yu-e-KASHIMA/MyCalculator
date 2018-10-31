package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class MemoryRecallKey {

	public MemoryRecallKey(KeyAllocator allocator) {
		allocator.label = "MR";
		allocator.functionId = 4;
		allocator.status = 1;
	}

}
