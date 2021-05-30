package javaPrograms;

import java.util.HashSet;
import java.util.Set;

public class removeDupStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {5,2,6,8,6,7,5,2,8};
		System.out.println(arr.length);
		
		Set<Integer> remArr = new HashSet<Integer>();
		for(int i : arr)
		{
			remArr.add(i);
			
		}
		System.out.println(remArr);
		System.out.println(remArr.size());
	}

}
