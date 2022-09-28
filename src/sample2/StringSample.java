package sample2;

public class StringSample {
	public static void main(String args[]){  
		String s1="sheelatiana@gmail.com";  
		String[] words=s1.split("@");//splits the string based on whitespace  
		//using java foreach loop to print elements of string array
		String s2="Sheela";
		System.out.println(s1.contains("sheela"));
		
		String s3="sheela";
		
		System.out.println(s2.charAt(1));
		
		System.out.println(words[1]);
		for(String w:words){  
		System.out.println(w);  
		}  }
}
