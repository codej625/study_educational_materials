package study;

public class Test {
	
	public static void main(String[] args) {
		
		// 전역변수 선언
		int num = 5;
		
		
		for (int i = 0; i <= num; i++) {
			
			// 부모 for문의 변수 사용
			/**
			 * j는 i보다 작을때까지만 반복하기 때문에 처음에는 한번만 반복됨
			 * 두번째는 i는 1이 되어서 두번 반복
			 * 세번째는 i는 2가 되어서 세번 반복
			 * 이런식으로 j는 i만큼 반복 
			 */
			for (int j = 0; j < i; j++) {
				// \n이 붙어있는 println이 아니므로 개행 되지않고 같은 line에 출력
				System.out.printf("*");
			}
			System.out.println("");
		}
		
	}

}
