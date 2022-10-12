package sample2;

/*class sam
{
	int[] arrsam(int a2[])
	{
		//int arr4[];
		for(int i=0;i<a2.length;i++)
		{
			arr4[i]=a2[i];
		}
		return arr4;
	}
}*/

class ArraySample {

	static int arr[] = { 1, 2, 3 };
	static int arr1[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
	static int arr2[][] = { { 1, 2, 3 }, { 4, 5, 6 } };

	public static void main(String[] args) {
		// sam s=new sam();
		/*
		 * int a3[]= {2,3,4}; int a1[]=s.arrsam(a3);
		 * 
		 * for(int k=0;k<a1.length;k++) { System.out.println(a1[k]); }
		 */
		char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e', 'i', 'n', 'a', 't', 'e', 'd' };
		// declaring a destination array
		char[] copyTo = new char[7];
		// copying array using System.arraycopy() method
		System.arraycopy(copyFrom, 2, copyTo, 0, 7);
		// printing the destination array
		System.out.println(String.valueOf(copyTo));
		for (int i = 0; i <= arr1.length; i++) {
			for (int j = 0; j <= arr2.length; j++) {
				System.out.println("arr" + (arr1[i][j] * arr2[i][j]));
			}
			System.out.println();
		}
	}
}
