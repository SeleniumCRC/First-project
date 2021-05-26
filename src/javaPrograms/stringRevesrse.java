package javaPrograms;

public class stringRevesrse {

	public static void main(String[] args) {
		String s = "Chetan";
		String rev ="";
		for(int i = s.length()-1;i >= 0;i--)
		{
			rev = rev + s.charAt(i);
		}
		System.out.println("The reverse string is "+rev);
	}

}
