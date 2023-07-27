package for문;

public class Ex01실습1 {

	public static void main(String[] args) {

		// for문
		// for(초기화 구문 ; 검사 조건 ; 반복후 작업){
		// 검사 조건이 true일때 실행문;
		// }
		
		// 21에서 57까지 출력
		for(int i = 1; i <= 10 ; i++){
			System.out.print(i + " ");
		}
		// 96에서 53까지 출력
		System.out.println();
		for(int i = 96; i >= 53 ; i--){
			System.out.print(i + " ");
		}
		System.out.println();
		// 21에서 57까지 홀수만 출력
		for(int i = 21; i <= 57 ; i += 2){
			System.out.print(i + " ");
		}
	}

}
