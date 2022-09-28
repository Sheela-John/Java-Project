package sample2;
import java.util.*;  
public class ArrayListSample {

	public static void main(String[] args) {
		
		ArrayList<String> name=new ArrayList<String>();
		
		name.add("Sheela");
		name.add("John");
		name.add("Tiana");
		name.add("Grace");
		
		System.out.println(name);
		
		for(String n:name)
			System.out.println(n);
		
		System.out.println("Father "+name.get(1));
		name.set(1, "John Paul");
		System.out.println("Father Full Name"+name.get(1));
		
		Collections.sort(name);
		
		for(String sn:name)
			System.out.println(sn);
	}
}
