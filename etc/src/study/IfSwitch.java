package study;

public class IfSwitch {

	public static void main(String[] args) {

		/**
		 * 1. 조건문을 사용하여 입력된 숫자가 봄, 가을, 여름, 겨울중 어디에 해당하는지 콘솔창에 출력하시오.
		 * 
		 * 힌트1: switch문은 break가 없으면 맨 마지막 조건까지 내려갑니다.
		 */

		int month = 5;

		switch (month) {
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;

		}

		/**
		 * 2. 점수별로 등급을 나누는 조건문을 만드세요 점수 입력시 콘솔창에 등급이 출력되야 합니다. 
		 *    A는 90점 이상, B는 70점이상, C는 50점 이상, 그 이하는 F입니다.
		 */

		int score = 90;

		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 70) {
			System.out.println("B");
		} else if (score >= 50) {
			System.out.println("C");
		} else {
			System.out.println("F");
		}
		
		
		/**
		 * 3. 구구단을 조건문과 반복문을 사용하여 만들고 콘솔창에 출력되게 만드세요
		 *    단이 끝날때마다 구분선이 출력되어야 합니다.
		 *    ex) ...
		 *    	  8단 8 x 8 = 64
		 *        8단 8 x 9 = 72
		 *        ============================ <- 이런식으로 
		 *    단, 마지막 9단은 구분선이 없어야 합니다.
		 *    
		 * 힌트1: for문은 두개를 사용하셔야 합니다.
		 */
		
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "단 " + i + " x " + j + " = " + i*j);
			}
			if (i != 9) {
				System.out.println("============================");
			}
		}
		
	}

}
