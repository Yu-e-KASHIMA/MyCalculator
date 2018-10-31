package mycalculator.key;

import mycalculator.config.KeyAllocator;

public interface KeyLabel {
	public KeyAllocator allocate(int status);
}
