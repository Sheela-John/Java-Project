package sample1;

public class ConstructorExample {
	int id;
	String name;

	ConstructorExample() {
		System.out.println("Constructor");
	}

	ConstructorExample(int i, String s) {
		id = i;
		name = s;
	}

	ConstructorExample(ConstructorExample ce2) {
		id = ce2.id + 1;
		name = ce2.name + " John";
	}

	void display() {
		System.out.println("id" + id + " name " + name);
	}

	public static void main(String[] args) {
		ConstructorExample ce = new ConstructorExample(1, "Sheela");
		ConstructorExample ce1 = new ConstructorExample();
		ConstructorExample ce3 = new ConstructorExample(ce);
		ce.display();
		ce3.display();
	}
}
