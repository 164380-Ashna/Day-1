package com.cg.DataStructure;

public class BubbleSortDemo {

	public static void main(String[] args) {
		int[] arr= new int[]{5,12,14,6,78,19,1,23,16,35,37,7,52,86,47};
		int i;
		int j;
		int length=arr.length;
		
		for(i=0;i<length-1;i++)
		{
			for (j=0;j<length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		for(i=0;i<length;++i)
		{
			System.out.println("Sorted array is as below:");
			System.out.println(arr[i]+"");
			System.out.println();
		}

	}

}
