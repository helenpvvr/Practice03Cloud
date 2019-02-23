import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		Person person = new Person(name, age);
		person.greeting();
	}
	
	private String name;
	private String age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	private void greeting() {
		System.out.println("Hello, " + name \nFor your " + age + " years to write 'Hello, someone' is not the best desision : )");
	}

}
