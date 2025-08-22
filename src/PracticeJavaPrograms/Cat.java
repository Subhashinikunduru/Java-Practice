package PracticeJavaPrograms;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("Cat sounds meow meow");
	}

	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.eat();
		Cat c = new Cat();
		c.eat();
		c.sound();
	}

}
