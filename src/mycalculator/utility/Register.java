package mycalculator.utility;

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

}
