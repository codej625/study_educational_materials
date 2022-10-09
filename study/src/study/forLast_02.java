package study;

public class forLast_02 {

	public static void main(String[] args) {

		/**
		 * 1. 12345 
		 *    54321 
		 *    0261220
		 * 
		 * 위를 차례대로 콘솔 창에 출력하시오.
		 * 
		 * 힌트1: switch문과 if문 둘 다 사용할 수 있습니다. 
		 * 힌트2: 첫 번째 for문은 반복의 역할, 두 번째 for문은 조건을 만드세요
		 * 힌트3: 세 가지 변수를 사용하세요(변수 선언의 횟수제한은 없습니다. 무료니까 마음껏 쓰세요)
		 * 힌트4: print? printf? println?
		 */

		int iLength = 3, jLength = 5, varTotal = 0;

		for (int i = 0; i < iLength; i++) {

			for (int j = 0; j < jLength; j++) {
				if (i == 0) {
					System.out.print(j + 1);
				} else if (i == 1) {
					System.out.print((iLength + 1) - j);
				} else if (i == 2) {
					varTotal += i * j;
					System.out.print(varTotal);
				}

//				switch (i) {
//				case 0:
//					System.out.print(j + 1);
//					break;
//				case 1:
//					System.out.print((iLength + 1) - j);
//					break;
//				case 2:
//					varTotal += i * j;
//					System.out.print(varTotal);
//					break;
//				}
			}
			System.out.println();
		}

	}

}
