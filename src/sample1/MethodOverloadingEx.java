package sample1;

class method {
	
	void methodoverloading() 
	{
		System.out.println("without parameter");
	}
	
	void methodoverloding(int a, int b)
	{
		System.out.println("With paramter "+(a+b));
	}
}
public class MethodOverloadingEx {

	public static void min(String[] args)
	{
		method m=new method();
		m.methodoverloading();
		m.methodoverloding(1, 2);
	}
}
