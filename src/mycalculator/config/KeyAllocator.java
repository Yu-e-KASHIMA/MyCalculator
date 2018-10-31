package mycalculator.config;

import mycalculator.key.ClearKey;
import mycalculator.key.DivisionKey;
import mycalculator.key.DotKey;
import mycalculator.key.EightKey;
import mycalculator.key.EqualKey;
import mycalculator.key.FiveKey;
import mycalculator.key.FourKey;
import mycalculator.key.MemoryClearKey;
import mycalculator.key.MemoryRecallKey;
import mycalculator.key.MemorySaveKey;
import mycalculator.key.MinusKey;
import mycalculator.key.MultiplicationKey;
import mycalculator.key.NineKey;
import mycalculator.key.OneKey;
import mycalculator.key.PercentKey;
import mycalculator.key.PlusKey;
import mycalculator.key.SevenKey;
import mycalculator.key.SignInversionKey;
import mycalculator.key.SixKey;
import mycalculator.key.SquareRootKey;
import mycalculator.key.ThreeKey;
import mycalculator.key.TwoKey;
import mycalculator.key.WithRemainderKey;
import mycalculator.key.ZeroKey;

public class KeyAllocator {
	public String label;
	public int functionId;
	public int status;

	public KeyAllocator() {}

	public KeyAllocator(String label, int functionId, int status) {
		this.label = label;
		this.functionId = functionId;
		this.status = status;
	}

	public void allocate(short keyId) {

		switch(keyId){
		case 0: new MemoryClearKey(this);
				break;
		case 1: new MemoryRecallKey(this);
				break;
		case 2: new MemorySaveKey(this);
				break;
		case 3: new ClearKey(this);
				break;
		case 4: new SquareRootKey(this);
				break;
		case 5: new PercentKey(this);
				break;
		case 6: new SignInversionKey(this);
				break;
		case 7: new WithRemainderKey(this);
				break;
		case 8: new SevenKey(this);
				break;
		case 9: new EightKey(this);
				break;
		case 10: new NineKey(this);
				break;
		case 11: new DivisionKey(this);
				break;
		case 12: new FourKey(this);
				break;
		case 13: new FiveKey(this);
				break;
		case 14: new SixKey(this);
				break;
		case 15: new MultiplicationKey(this);
				break;
		case 16: new OneKey(this);
				break;
		case 17: new TwoKey(this);
				break;
		case 18: new ThreeKey(this);
				break;
		case 19: new MinusKey(this);
				break;
		case 20: new ZeroKey(this);
				break;
		case 21: new DotKey(this);
				break;
		case 22: new EqualKey(this);
				break;
		case 23: new PlusKey(this);
				break;
		}
	}
}
