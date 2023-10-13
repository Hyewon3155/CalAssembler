
public class CalAssembler {
	public int calAdd(int firstNum, int secondNum, CalAdd calAdd) {
		return calAdd.doOperation(firstNum, secondNum);
	}
	public int calSub(int firstNum, int secondNum, CalSub calSub) {
		return calSub.doOperation(firstNum, secondNum);
	}
	public int calDiv(int firstNum, int secondNum, CalDiv calDiv) {
		return calDiv.doOperation(firstNum, secondNum);
	}
	public int calMul(int firstNum, int secondNum, CalMul calMul) {
		return calMul.doOperation(firstNum, secondNum);
	}
	public int calRem(int firstNum, int secondNum, CalRem calRem) {
		return calRem.doOperation(firstNum, secondNum);
	}
}
