package day43sorting;

import java.util.Arrays;

public class InsertionSort {

	public static void main(String[] args) {
		int arr[]= {7,3,6,8,5,2};
		System.out.println("Before Sorting "+ Arrays.toString(arr));
		
		int k,j,temp;
		for(k=1;k<arr.length;k++)
		{
			j=k-1;
			temp=arr[k];
			
			while(j>=0 && temp<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			
			arr[j+1]=temp;
		}
		
		System.out.println("After Sorting "+ Arrays.toString(arr));
	}

}
