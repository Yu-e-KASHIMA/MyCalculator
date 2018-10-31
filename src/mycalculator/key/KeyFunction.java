package mycalculator.key;

import mycalculator.config.Register;

public interface KeyFunction {
	public Register allocate(Register register, int status);
}
