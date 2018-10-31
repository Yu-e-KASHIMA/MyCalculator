package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class TransformKey {
	public KeyLabel label = (tr) -> {
		String label = "±";
		switch(tr) {
		case 1: label = "％";
		break;
		case 2: label = "√";
		break;
		}
		return new KeyAllocator(label, 3, tr);
	};

	public KeyFunction function = (register, tr) -> {
		double b = (register.isZero == true) ? 0 : Double.parseDouble(register.regB);
		switch(tr){
		case 0:	register.regB = String.valueOf(b * -1);
		break;
		case 1:	register.regB = String.valueOf(b * 0.01);
		break;
		case 2:	if(b > 0){
					register.regB = String.valueOf(Math.sqrt(b));
				}
		break;
		}
		return register;
	};
}
