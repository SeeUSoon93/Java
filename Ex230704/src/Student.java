
public class Student {

	// 필드(이름, 학번, 나이, Java점수, Web점수, Android점수)
	String name;
	String number;
	int age;
	int scoreJava;
	int scoreWeb;
	int scoreAndroid;

	public Student(String name, String number, int age, int scoreJava, int scoreWeb, int scoreAndroid) {
		super();
		this.name = name;
		this.number = number;
		this.age = age;
		this.scoreJava = scoreJava;
		this.scoreWeb = scoreWeb;
		this.scoreAndroid = scoreAndroid;
	}

	public void show() {
		// 김군순님 안녕하세요.
		// [19930210, 31살]
		// 김군순님의 Java점수는 100점입니다.
		// 김군순님의 Web점수는 100점입니다.
		// 김군순님의 Android점수는 100점입니다.

		System.out.printf("%s님 안녕하세요.%n", name);
		System.out.printf("[%s, %d살]%n", number, age);
		System.out.printf("%s님의 Java점수는 %d점입니다.%n", name, scoreJava);
		System.out.printf("%s님의 Web점수는 %d점입니다.%n", name, scoreWeb);
		System.out.printf("%s님의 Android점수는 %d점입니다.%n", name, scoreAndroid);
		System.out.println("==================================");

	}
}
