package study;

public class ForLast {

	public static void main(String[] args) {

		/**
		 * 1. 한가지의 변수와 세 가지의 배열을 사용하여 아래와 같이 콘솔 창에 출력되게 만드시오.
		 * =================
		   아이유 조보아 사나 
		   나연 채령 예지 
		   이유비 장원영 해서웨이 
		   =================
		 * 
		 * 힌트1: 부모 for 문의 변수를 잘 활용해야 할지도?
		 */
		int arrayLength = 3;
		
		String[] aClass = { "아이유", "조보아", "사나" };
		String[] bClass = { "나연", "채령", "예지" };
		String[] cClass = { "이유비", "장원영", "해서웨이" };

		for (int i = 0; i < arrayLength; i++) {

			if (i == 0) {
				System.out.println("=================");
			}

			for (int j = 0; j < arrayLength; j++) {
				
				switch (i) {
				case  0: System.out.print(aClass[j] + " "); break;
				case  1: System.out.print(bClass[j] + " "); break;
				default: System.out.print(cClass[j] + " "); break;
				}
//				if (i == 0) {
//					System.out.print(aClass[j] + " ");
//				} else if (i == 1) {
//					System.out.print(bClass[j] + " ");
//				} else {
//					System.out.print(cClass[j] + " ");
//				}
			}
			System.out.println();

			if (i == arrayLength - 1) {
				System.out.println("=================");
			}
		}
		
		/**
		 * 2. 아래와 같이 콘솔 창에 출력되게 만드시오.
		 * 
		   ****
    	   ****
		   ****
		   ****
		 * 
		 * 힌트2: 첫 번째 for 문은 반복의 역할을, 두 번째 for 문은 모양을 만드는 역할을 합니다.
		 */
		
		int forLength = 4;
		
		for (int i = 0; i < forLength; i++ ) {
			for (int j = 0; j < forLength; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
