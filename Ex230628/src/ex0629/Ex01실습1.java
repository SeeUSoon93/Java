package ex0629;

import java.util.Random;
import java.util.Scanner;

public class Ex01실습1 {

	public static void main(String[] args) {

		String team[] = { "김군순", "최윤석", "임유민", "김동민" };

		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		
		String name = sc.next();

		for (int i = 0; i < team.length; i++) {
			if (name.equals(team[i])) {
				System.out.println(team[i] + "님은 " + i + "번 인덱스에 있습니다.");
			}
		}

	}

}
