package javaPrograms;

public class arrayProblem {
	public void minNumber(int arr[])
	{
		int min =arr[0];
		for(int j=1;j<arr.length;j++) 
		{
			if(min>arr[j])
			{
				min = arr[j];
			}
			//System.out.println(min);	
		}
		System.out.println("The minimum no is"+min);
		
	}

	public static void main(String[] args) {
		int[] arr = new int[10];
		int length = arr.length;
		arr[0] =10;
		arr[1] =52;
		arr[2] =6;
		arr[3] =10;
		arr[4] =41;
		arr[5] =1;
		arr[6] =30;
		arr[7] =98;
		arr[8] =47;
		arr[9] =36;
		System.out.println("The lenght of array"+length);
		for(int i : arr)
		{
			System.out.println("\n"+i);
		}
		System.out.println(arr[5]);
		arrayProblem ap = new arrayProblem();
		ap.minNumber(arr);
		
	}

}
