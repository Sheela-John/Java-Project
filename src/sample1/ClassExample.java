package sample1;

class ex1
{
	int id;
	
	void agecalc(int n,String cls)
	{
		id=n;
		if(id<10)
		{
			System.out.println(cls);
		}
		else
			System.out.println(cls);
	}
}
public class ClassExample {
	public static void main(String[] args)
{
	ex1 i=new ex1();
	i.id=5;
	i.agecalc(5,"class b");
	
}
}
