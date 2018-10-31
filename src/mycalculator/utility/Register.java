package mycalculator.utility;

import mycalculator.function.ClearAction;
import mycalculator.function.MemoryAction;
import mycalculator.function.NumberAction;
import mycalculator.function.OperatorAction;
import mycalculator.function.TransformAction;

public class Register {
	public String memoryInfo;
	public String calculationInfo;
	public String remainderInfo;
	public String numberInfo;
	public String operatorSymbol;
	public String regA;
	public String regB;
	public int operationMode;
	public double memory;
	public double remainder;
	public boolean isZero;
	public boolean dotUsed;

	public Register(){
		memoryInfo = "";
		remainderInfo = "";
		operatorSymbol = "";
		regA = "";
		regB = "";
		operationMode = 0;
		memory = 0;
		remainder = 0;
		isZero = true;
		dotUsed = false;
	}

	public Register allocate(Register register, int functionId, int status){
		switch(functionId){
		case 0: register = (new ClearAction(register)).register;
		break;
		case 1:	register = (new NumberAction(register,status)).register;
		break;
		case 2:	register = (new OperatorAction(register,status)).register;
		break;
		case 3:	register = (new TransformAction(register,status)).register;
		break;
		case 4:	register = (new MemoryAction(register,status)).register;
		break;
		}
		return register;
	}
}
