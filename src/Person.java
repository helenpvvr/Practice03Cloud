import java.util.Scanner;

public class Person {

	public static void main(String[] args) {
		System.out.println("Enter your name: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		Person person = new Person(name);
		person.greeting();
	}
	
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	private void greeting() {
		System.out.println("Hello, " + name);
	}

}
