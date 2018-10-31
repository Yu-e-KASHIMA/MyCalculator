package mycalculator.key;

import mycalculator.config.KeyAllocator;

public class NumberKey {
	public KeyLabel label = (num) -> {
		String label = (0 <= num && num <= 9) ? String.valueOf(num) : ".";
		return new KeyAllocator(label, 1, num);
	};

	public KeyFunction function = (register, num) -> {
		switch(num){
		case 0:	if(register.isZero == false || register.dotUsed == true){
					register.regB += "0";
				}
				break;
		case 10:if(register.dotUsed == false){
					if(register.isZero == true){
						register.regB = "0";
					}
					register.regB += ".";
					register.dotUsed = true;
				}
				break;
		default:if(register.regB == "0"){
					register.regB = "";
				}
				register.regB += String.valueOf(num);
				register.isZero = false;
				break;
		}
		if(register.regB.isEmpty()){
			register.regB = "0";
		}
		return register;
	};
}
