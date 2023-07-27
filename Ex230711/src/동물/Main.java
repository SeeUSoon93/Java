package 동물;

public class Main {

	public static void main(String[] args) {
		System.out.println("===========조류===========");
		Bird b = new Bird();
		b.eat();
		b.sleep();
		b.move();
		b.egg();
		System.out.println("===========참새===========");
		Charm c = new Charm();
		c.eat();
		c.sleep();
		c.move();
		c.egg();
		c.cry();
		System.out.println("===========펭귄===========");
		Penguin p = new Penguin();
		p.eat();
		p.sleep();
		p.move();
		p.egg();
		p.sliding();
		
	}

}
