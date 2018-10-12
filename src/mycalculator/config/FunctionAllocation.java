package mycalculator.config;

import mycalculator.function.ClearAction;
import mycalculator.function.MemoryAction;
import mycalculator.function.NumberAction;
import mycalculator.function.OperatorAction;
import mycalculator.function.TransformAction;
import mycalculator.utility.Register;

public class FunctionAllocation {

	Register register = new Register();

	public Register allocate(Register register, int functionId, int status){

		switch(functionId){
		case 0:
				this.register = (new ClearAction(register)).register;
				break;

		case 1:	this.register = (new NumberAction(register,status)).register;
				break;

		case 2:	this.register = (new OperatorAction(register,status)).register;
				break;

		case 3:	this.register = (new TransformAction(register,status)).register;
				break;

		case 4:	this.register = (new MemoryAction(register,status)).register;
				break;
		}

		return this.register;

	}

}
