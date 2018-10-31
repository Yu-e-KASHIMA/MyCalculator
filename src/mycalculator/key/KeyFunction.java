package mycalculator.key;

import mycalculator.utility.Register;

public interface KeyFunction {
	public Register allocate(Register register, int status);
}
