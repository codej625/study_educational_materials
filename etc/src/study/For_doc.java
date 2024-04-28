package study;

public class For_doc {

	public static void main(String[] args) {
		
		/**
		 * for에 대해 알아보자.
		 */
		
		/** 
		 * for의 ( ... ) <= 안에는 변수(선언과 동시 초기화), 조건문, 증감자로 이루어져 있다.
		 */	
		
		// ex)  변수     조건문     증감자
		for (int i = 0; i <= 10; i++) {
			System.out.println("i => " + i);
		}
		
		/**
		 * 그렇다면 변수 없이 for 문을 만들 수 있을까?
		 */
		
		// global variable 
		int j = 0;
		
		// 변수 자리에 꼭 변수가 없어도 for문 사용이 가능하다.
		for (; j <= 10; j++) {
			System.out.println("j => " + j);
		}
		
		/**
		 * 이중 for 문을 사용할 때 부모 for 문의 변수를 사용할 수 있을까?
		 */
		for (int var_1 = 0; var_1 <= 5; var_1++) {
			for (int var_2 = 0; var_2 < var_1; var_2++) {
			/**
			 * 위와 같이 변수를 사용한다면 첫 번째 for 문은 반복의 역할을,
	 		 * 두 번째 for 문은 차례대로 증가하며 출력된다.
			 */
				// print() 메소드는 개행문자(줄바꿈)이 포함되지 않은 출력만을 위한 메소드이다.
				System.out.print("*");
			}
			// println() 메소드는 print(출력) + \n 개행문자(줄바꿈)의 조합을 나타낸것 즉, 한줄이 개행되어 출력된다.
			System.out.println();
		}
		
	}

}
