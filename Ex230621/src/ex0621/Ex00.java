package ex0621;

public class Ex00 {

	public static void main(String[] args) {

		int[] intArray = new int[5];
		int[] myArray = intArray;

		System.out.println(intArray);
		System.out.println(myArray);

		intArray[2] = 8;
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);

		myArray[2] = 5;
		System.out.println(intArray[2]);
		System.out.println(myArray[2]);

	}

}
