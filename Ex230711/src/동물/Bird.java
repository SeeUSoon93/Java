package 동물;

import animal.Animal;

public class Bird extends 동물.Animal {
	
	@Override
	public void move() {
		System.out.println("날다");
	}
	
	public void egg() {
		System.out.println("알을 낳다");
	}
	
	
}
