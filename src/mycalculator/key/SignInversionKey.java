package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class SignInversionKey {

	public SignInversionKey(KeyAllocator allocator) {
		allocator.label = "±";
		allocator.functionId = 3;
		allocator.status = 0;
	}

}
