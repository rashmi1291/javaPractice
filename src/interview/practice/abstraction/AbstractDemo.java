package interview.practice.abstraction;

public abstract class AbstractDemo {

	AbstractDemo() {
		System.out.println("AbstractDemo constructor");
	}

	AbstractDemo(int a, int b) {
		System.out.println("AbstractDemo Parameterized Constructor");
		this.a = a;
		this.b = b;
	}

	int a, b;

	abstract void run();

	void show() {
		System.out.println("Inside Abstarct Show");
	}

}
