package mycalculator.function;

import mycalculator.utility.Register;

public class NumberAction {

	public Register register;

	public NumberAction(Register register, int status){

		switch(status){
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
				register.regB += String.valueOf(status);
				register.isZero = false;
				break;
		}

		if(register.regB.isEmpty()){
			register.regB = "0";
		}

		this.register = register;

	}


}
