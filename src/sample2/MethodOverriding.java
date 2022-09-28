package sample2;

class methods
{
	int methodoverriding()
	{
		return 0;
	}

	
}
class method1 extends methods
{
	int methodoverriding()
	{
		return 1;
	}
}
class method2 extends methods
{
	int methodoverriding()
	{
		return 2;
	}
}
class MethodOverriding {

	public static void main(String[] args)
	{
		methods m=new methods();
		method1 m1=new method1();
		method2 m2=new method2();
		System.out.println(m.methodoverriding());
		System.out.println(m1.methodoverriding());
		System.out.println(m2.methodoverriding());
	}
}
