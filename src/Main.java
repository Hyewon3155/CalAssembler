import java.util.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("원하는 숫자를 두 개 입력해주세요");
		Scanner scanner = new Scanner(System.in);
	    System.out.print("첫 번째 숫자: ");
		int firstNum = scanner.nextInt();
	    System.out.print("두 번째 숫자: ");
		int secondNum = scanner.nextInt();
		
		System.out.println("원하는 기능을 선택해주세요");
		System.out.println("1. 덧셈 2. 뺄셈 3. 곱셈 4. 나눗셈 5. 나머지");
		int answer = scanner.nextInt();
		System.out.printf("%d", answer);
		scanner.close();
		
		int answer2 = 0;
		
		CalAssembler calAssembler = new CalAssembler();
		switch(answer) {
			case 1:
				answer2 = calAssembler.calAdd(firstNum, secondNum, new CalAdd());
				break;
			case 2:
				answer2 = calAssembler.calSub(firstNum, secondNum, new CalSub());
				break;
			case 3:
				answer2 = calAssembler.calMul(firstNum, secondNum, new CalMul());
				break;
			case 4:
				answer2 = calAssembler.calDiv(firstNum, secondNum, new CalDiv());
				break;
			case 5:
				answer2 = calAssembler.calRem(firstNum, secondNum, new CalRem());
				break;
		}
		System.out.printf("정답은 %d입니다!", answer2);

				
	}

}
