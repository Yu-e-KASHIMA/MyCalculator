package mycalculator.config;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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

			KeyAllocation key = new KeyAllocation();
			key.allocate(keyId);

			JButton button = new JButton(key.allocator.label);
			button.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					register = function.allocate(register, key.allocator.functionId, key.allocator.status);
					viewRegenerate(register);
				}
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
