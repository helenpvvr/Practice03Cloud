import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		System.out.println("Enter your name and age: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int age = sc.nextInt();
		Person person = new Person(name, age);
	}
	
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
		greeting();
	}
	
	private void greeting() {
		System.out.println("Hello, " + name + ", your age: " + age);
	}

}
