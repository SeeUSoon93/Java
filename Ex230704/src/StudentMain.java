import java.util.Random;

public class StudentMain {

	public static void main(String[] args) {
		Random rd = new Random(); 
		
		
		Student student1 = new Student("이주희","19961025",28,55,36,85);
		Student student2 = new Student("김군순","19930210",31,70,100,70);
		
		student1.show();
		student2.show();
		
	}

}
