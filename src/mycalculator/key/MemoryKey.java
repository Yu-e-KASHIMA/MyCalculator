package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class MemoryKey {
	public KeyLabel label = (m) -> {
		String label = "MC";
		switch(m) {
		case 0: label = "MS";
		break;
		case 1: label = "MR";
		break;
		}
		return new KeyAllocator(label, 4, m);
	};

	public KeyFunction function = (register, m) -> {
		switch(m){
		case 0: register.memory = Double.parseDouble(register.numberInfo);
		break;
		case 1: register.regB = String.valueOf(register.memory);
		break;
		default: register.memory = 0;
		break;
		}
		return register;
	};
}
