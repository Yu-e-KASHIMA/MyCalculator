package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class WithRemainderKey {

	public WithRemainderKey(KeyAllocator allocator) {
		allocator.label = "÷余り";
		allocator.functionId = 2;
		allocator.status = 5;
	}

}
