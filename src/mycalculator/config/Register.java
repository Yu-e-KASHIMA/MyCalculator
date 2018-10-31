package mycalculator.config;

import mycalculator.key.ClearKey;
import mycalculator.key.MemoryKey;
import mycalculator.key.NumberKey;
import mycalculator.key.OperatorKey;
import mycalculator.key.TransformKey;

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
		case 0: register = (new ClearKey()).function.allocate(register, status);
		break;
		case 1:	register = (new NumberKey()).function.allocate(register, status);
		break;
		case 2:	register = (new OperatorKey()).function.allocate(register, status);
		break;
		case 3:	register = (new TransformKey()).function.allocate(register, status);
		break;
		case 4:	register = (new MemoryKey()).function.allocate(register, status);
		break;
		}
		return register;
	}
}
