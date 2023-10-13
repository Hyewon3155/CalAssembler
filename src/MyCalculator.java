
public class MyCalculator {
	public int  calculte(int firstNum, int secondNum, ICalculator iCalculator) {
		return iCalculator.doOperation(firstNum, secondNum);
	}
}
