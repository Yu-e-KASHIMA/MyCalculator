package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class MultiplicationKey {

	public MultiplicationKey(KeyAllocator allocator) {
		allocator.label = "×";
		allocator.functionId = 2;
		allocator.status = 3;
	}

}
