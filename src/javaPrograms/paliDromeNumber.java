package javaPrograms;

public class paliDromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 2565;
		int original = num;
		int rev=0;
		while(num>0)
		{
			int temp;
			temp= num%10;
			System.out.println(temp);
			rev=temp+(rev*10);
			num=num/10;
			System.out.println(num);
		}
		System.out.println(rev);
		
		if(original==rev)
			System.out.println("The number is palidrome");
		else
			System.out.println("The number is not palidrome");
	}

}
