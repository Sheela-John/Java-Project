package sample2;

public class WhileSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name[]={"John","Sheela","Tiana","Grace"};
		int i=0;
		while(i<name.length)
		{
			if(name[i]=="Tiana1")
			{
				System.out.println("Tiana is present");
				break;
			}
			else
				i++;
			
			
		}System.out.println("Tiana absent");
		
	}

}
