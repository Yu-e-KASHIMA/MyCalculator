package mycalculator.function;

import mycalculator.utility.Register;

public class TransformAction {

	public Register register;

	public TransformAction(Register register, int status){

		double b;

		if(register.isZero == true){
			b = 0;
		}else{
			b = Double.parseDouble(register.regB);
		}

		switch(status){
		case 0:	register.regB = String.valueOf(b * -1);
				break;

		case 1:	register.regB = String.valueOf(b * 0.01);
				break;

		case 2:	if(b > 0){
					register.regB = String.valueOf(Math.sqrt(b));
				}
				break;
		}

		this.register = register;

	}


}
