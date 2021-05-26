package javaPrograms;

public class reverseNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 2565;
		int rev=0;
		while(num>0)
		{
			int temp;
			temp= num%10;
		//	System.out.println(temp);
			rev=temp+(rev*10);
			num=num/10;
			//System.out.println(num);
		}
		System.out.println(rev);
	}

}
