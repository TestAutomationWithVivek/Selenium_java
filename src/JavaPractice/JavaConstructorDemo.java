package JavaPractice;

public class JavaConstructorDemo {
	String name;
	int rollNum;
	public JavaConstructorDemo(String name, int rollNum) {
		this.name = name;
		this.rollNum = rollNum;
	}

	public static void main(String[] args) {
		JavaConstructorDemo result = new JavaConstructorDemo("Vivek", 100);
		System.out.println(result.name + " " + result.rollNum);
	}

}
