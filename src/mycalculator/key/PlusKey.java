package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class PlusKey {

	public PlusKey(KeyAllocator allocator) {
		allocator.label = "＋";
		allocator.functionId = 2;
		allocator.status = 1;
	}

}
