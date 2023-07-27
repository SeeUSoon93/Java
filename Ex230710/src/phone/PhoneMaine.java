package phone;

public class PhoneMaine {

	public static void main(String[] args) {

		Phone ph = new Phone();
		SmartPhone sph = new SmartPhone();
		
		ph.call();
		ph.answer();
		
		System.out.println("====================");
		
		sph.call();
		sph.answer();
		sph.Mp3play();
		sph.Internet();
	}

}
