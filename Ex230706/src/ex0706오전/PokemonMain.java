package ex0706오전;

import java.util.Arrays;

public class PokemonMain {

	public static void main(String[] args) {

		// 1. 객체 배열 생성
		// 자료명[] 배열이름 = new 자료형[배열크기];
		// 포켓몬 자료 3개를 저장할 수 있는 배열 생성->bag

		Pokemon[] bag = new Pokemon[3];

		bag[0] = new Pokemon("피카츄", "전기", "암", 100, 120, 80, "볼트태클");
		bag[1] = new Pokemon("리자몽", "불,비행", "수", 230, 280, 150, "블러스트번");
		bag[2] = new Pokemon("뮤츠", "에스퍼", "없음", 270, 300, 180, "사이코키네시스");

		// for문을 사용해서 배열안에 들어있는 포켓몬들의 이름, 속성, hp, atk,dps, 스킬
		// 형식
		// ===== 포켓몬 정보 출력 =====
		// 1) 피카츄 전기 100 120 80 볼트태클
		// 2) 리자몽 불,비행 230 280 150 블러스트번
		// 3) 뮤츠 에스퍼 270 300 180 사이코키네시스

		System.out.println("================== 포켓몬 정보 출력 ==================");
		for (int i = 0; i < bag.length; i++) {
			String name = bag[i].getName();
			String type = bag[i].getType();
			int hp = bag[i].getHp();
			int atk = bag[i].getAtk();
			int dpd = bag[i].getDpd();
			String skill = bag[i].getSkill();

			System.out.printf(i + 1 + ") %s\t %s\t %d\t %d\t %d\t %s%n", name, type, hp, atk, dpd, skill);
		}

		// for-each(확장 for문)
		// 배열과 같이 여러개의 데이터를 저장하는 자료구조와 함께 사용
		// 동작원리
		// 배열안에 저장되어 있는 데이터를 for문에서 순차적으로 꺼내서
		// :(콜론) 기준 왼쪽에 있는 변수에 담아 사용한다.
		// for(자료형 변수명 : 배열명)

		System.out.println("==================== for-each ====================");
		int i = 1;
		for (Pokemon poke : bag) {

			System.out.printf("%d) %s\t %s\t %d\t %d\t %d\t %s%n",
					i++, poke.getName(), poke.getType(), poke.getHp(), poke.getAtk(), poke.getDpd(), poke.getSkill());
		}

	}

}
