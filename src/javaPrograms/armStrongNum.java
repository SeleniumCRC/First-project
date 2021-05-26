package javaPrograms;

public class armStrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =153;
		int arm = num,sum=0;
		while(num>0)
		{
			int temp;
			temp= num%10;
			sum = sum +(temp*temp*temp);
			num=num/10;
		}
		System.out.println(sum);
		if(arm==sum)
			System.out.println("The number is armstrong number"+arm);
		else
			System.out.println("The number is not armstrong number"+arm);	
	}

}
