package sample2;

class method {

	void methodoverloading() {
		System.out.println("without parameter");
	}

	void methodoverloding(int a, int b) {
		System.out.println("With paramter " + (a + b));
	}
}

public class MethodOverloadinEx {

	public static void main(String[] args) {
		method m = new method();
		m.methodoverloading();
		m.methodoverloding(1, 2);
	}
}