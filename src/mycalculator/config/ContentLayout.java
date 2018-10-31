package mycalculator.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import mycalculator.utility.Register;

public class ContentLayout extends JPanel {

	Register register = new Register();
	FunctionAllocation function = new FunctionAllocation();

		JLabel memoryLabel = new JLabel(register.memoryInfo);
		JLabel calculationLabel = new JLabel(register.calculationInfo);
		JLabel remainderLabel = new JLabel(register.remainderInfo);
		JLabel numberLabel = new JLabel(register.numberInfo);

	public ContentLayout(){

		viewRegenerate(register);

		setLayout(new BorderLayout());

		JPanel registerView = new JPanel();
		registerView.setLayout(new GridLayout(2,2));
		registerView.setBackground(Color.WHITE);

		calculationLabel.setHorizontalAlignment(JLabel.RIGHT);
		numberLabel.setHorizontalAlignment(JLabel.RIGHT);

		registerView.add(memoryLabel);
		registerView.add(calculationLabel);
		registerView.add(remainderLabel);
		registerView.add(numberLabel);

		add(registerView,BorderLayout.PAGE_START);


		JPanel keyboard = new JPanel();
		keyboard.setLayout(new GridLayout(6,4));

		for(short keyId = 0; keyId < 24; keyId ++){

			KeyAllocator key = new KeyAllocator();
			key.allocate(keyId);

			JButton button = new JButton(key.label);
			button.addActionListener((e) -> {
				register = function.allocate(register, key.functionId, key.status);
				viewRegenerate(register);
			});
			keyboard.add(button);

		}

		add(keyboard, BorderLayout.CENTER);

	}

	public void viewRegenerate(Register register){

		String regA = register.regA;
		String regB = register.regB;
		int mode = register.operationMode;


		if(register.memory == 0){
			register.memoryInfo = "";
		}else{
			register.memoryInfo = "M = " + String.valueOf(register.memory);
		}
		memoryLabel.setText(register.memoryInfo);


		register.calculationInfo = regA + register.operatorSymbol + regB + " ";
		calculationLabel.setText(register.calculationInfo);


		remainderLabel.setText(register.remainderInfo);


		if(regB != ""){
			register.numberInfo = regB + " ";
		}else if(regA != ""){
			register.numberInfo = regA + " ";
		}else{
			register.numberInfo = "0 ";
		}
		if(mode == 0){
			register.regA = "";
		}
		numberLabel.setText(register.numberInfo);
	}

}
