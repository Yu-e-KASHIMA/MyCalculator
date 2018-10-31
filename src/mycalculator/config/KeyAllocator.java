package mycalculator.config;

import mycalculator.key.ClearKey;
import mycalculator.key.MemoryKey;
import mycalculator.key.NumberKey;
import mycalculator.key.OperatorKey;
import mycalculator.key.TransformKey;

public class KeyAllocator {
	public String label;
	public int functionId;
	public int status;

	public KeyAllocator(String label, int functionId, int status) {
		this.label = label;
		this.functionId = functionId;
		this.status = status;
	}

	public KeyAllocator(int keyId) {
		KeyAllocator result = null;
		switch(keyId){
		case 0: result = (new MemoryKey()).label.allocate(2);
				break;
		case 1: result = (new MemoryKey()).label.allocate(1);
				break;
		case 2: result = (new MemoryKey()).label.allocate(0);
				break;
		case 3: result = (new ClearKey()).label.allocate(0);
				break;
		case 4: result = (new TransformKey()).label.allocate(2);
				break;
		case 5: result = (new TransformKey()).label.allocate(1);
				break;
		case 6: result = (new TransformKey()).label.allocate(0);
				break;
		case 7: result = (new OperatorKey()).label.allocate(5);
				break;
		case 8: result = (new NumberKey()).label.allocate(7);
				break;
		case 9: result = (new NumberKey()).label.allocate(8);
				break;
		case 10: result = (new NumberKey()).label.allocate(9);
				break;
		case 11: result = (new OperatorKey()).label.allocate(4);
				break;
		case 12: result = (new NumberKey()).label.allocate(4);
				break;
		case 13: result = (new NumberKey()).label.allocate(5);
				break;
		case 14: result = (new NumberKey()).label.allocate(6);
				break;
		case 15: result = (new OperatorKey()).label.allocate(3);
				break;
		case 16: result = (new NumberKey()).label.allocate(1);
				break;
		case 17: result = (new NumberKey()).label.allocate(2);
				break;
		case 18: result = (new NumberKey()).label.allocate(3);
				break;
		case 19: result = (new OperatorKey()).label.allocate(2);
				break;
		case 20: result = (new NumberKey()).label.allocate(0);
				break;
		case 21: result = (new NumberKey()).label.allocate(10);
				break;
		case 22: result = (new OperatorKey()).label.allocate(0);
				break;
		case 23: result = (new OperatorKey()).label.allocate(1);
				break;
		}
		this.label = result.label;
		this.functionId = result.functionId;
		this.status = result.status;
	}
}
