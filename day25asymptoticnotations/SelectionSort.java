package day25asymptoticnotations;

import java.util.Arrays;

public class SelectionSort {
public static void main(String[] args) {
	
	int arr[]= {7,5,4,9,2};
	System.out.println("Before Sorting" + Arrays.toString(arr));
	int i,j,temp;
	for(i=0;i<arr.length;i++)
	{
		for(j=i+1;j<arr.length;j++)
		{
			if(arr[i]>arr[j])
			{
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				
			}
		}
	}
	System.out.println("After Sorting" + Arrays.toString(arr));
	
	
}
}
