package mycalculator.key;

import mycalculator.config.KeyAllocator;
import mycalculator.config.Register;

public class ClearKey {
	public KeyLabel label = (clr) -> { return new KeyAllocator("CLR", 0, clr); };

	public KeyFunction function = (register, clr) -> {
		if(register.regB.isEmpty() || register.regB == "0"){
			double memoryBackup = register.memory;
			register = new Register();
			register.memory = memoryBackup;
		}else{
			register.regB = "0";
			register.isZero = true;
			register.dotUsed = false;
		}
		return register;
	};
}
