package day43sorting;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]={7,4,5,8};
		System.out.println("Before Sorting " + Arrays.toString(arr));
	    int i,j,temp;
		for(i=1; i<=arr.length; i++)
		{
		   for(j=0; j<arr.length-i; j++)
		   {
		     if(arr[j] < arr[j+1])
		     {
		           temp=arr[j];
		           arr[j] = arr[j+1];
		           arr[j+1]=temp;
		      }
		}
		}

		System.out.println("After Sorting " +Arrays.toString(arr));

	}

}
