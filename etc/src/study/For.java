package study;

public class For {

	public static void main(String[] args) {

		/**
		 * 1. for문을 사용하여 1부터 100까지 반복되는 반복문을 만들고 콘솔창에 1부터 100까지 출력되게 만드시오. 
		 *    단, 반복문의 조건은 변수를 사용하시오. 
		 * 힌트1: 밑에 예제를 참고
		 */

		int forNumber = 100;

		for (int i = 1; i <= forNumber; i++) {
			System.out.println("1번 문제 출력 => " + i);
		}
		System.out.println("===================================");

		/**
		 * 2. while문을 사용하여 1부터 100까지 반복되는 반복문을 만들고 중간에 조건문을 넣어 콘솔창에 짝수만 출력되게 만드시오.
		 * 
		 * 힌트1: 밑에 예제를 참고 
		 * 힌트2: %연산자를 사용한다. %는 나머지 값을 구하는 연산자로 ex) 3 % 2 = 1이다. 
		 * 힌트3: while문은 두가지 변수를 사용해야 한다. 증감연산자를 사용하여 숫자가 증가하는 변수와 반복문의 길이만큼 반복하기 위한 변수.
		 */

		int i = 1;
		int whileNumber = 100;

		while (i <= whileNumber) {

			if (i % 2 == 0) {
				System.out.println("2번 문제 출력 => " + i);
				i++;
			} else {
				i++;
				continue;
			}

		}
		System.out.println("===================================");

		/**
		 * 3. for문을 사용하여 1부터 50까지 반복되는 반복문을 만들고 중간에 조건문을 넣어 콘솔창에 홀수만 출력되게 만드시오. 
		 *    단 마지막 50은 반드시 출력되야 한다.
		 * 
		 * 힌트1: 밑에 예제를 참
		 */

		int forNumber2 = 50;

		for (int j = 1; j <= forNumber2; j++) {
			if (j % 2 == 1) {
				System.out.println("3번 문제 출력 => " + j);
			}
			if (j == forNumber2) {
				System.out.println("3번 문제 출력 + 50 출력 => " + j);
			}
		}

	}

}
