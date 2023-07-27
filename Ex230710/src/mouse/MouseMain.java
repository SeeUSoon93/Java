package mouse;

public class MouseMain {

	public static void main(String[] args) {

		Mouse mouse = new Mouse();
		mouse.leftClick();
		mouse.rightClick();
		mouse.drag();

		System.out.println("============================");

		WheelMouse wheel = new WheelMouse();
		wheel.drag();
		wheel.leftClick();
		wheel.rightClick();
		wheel.scroll();

		System.out.println("============================");

		ErgonomicsMouse mouse2 = new ErgonomicsMouse();
		mouse2.leftClick();
		mouse2.rightClick();
		mouse2.drag();
		mouse2.ReduceFatigue();
	}

}
