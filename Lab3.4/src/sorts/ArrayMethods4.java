package sorts;

public class ArrayMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test1= {7,15,31,4,6,2,8,9,12,1,14};
		printIntArray(test1);
		System.out.println();
		System.out.println();
		ArrayMethods4.quickSort(test1, 0, test1.length-1);
		System.out.println();
		printIntArray(test1);
	}
	public static int partition(int[] list1, int front, int back)
	{
		int pivotPos=0;
		int pivot=list1[0];
		while(front<=back)
		{
			while(list1[front]<=pivot)
			{
				front++;
			}
			while(list1[back]>pivot)
			{
				back--;
			}
			if(front<back)
			{
				intSwap(list1,front,back);
			}
		}
		intSwap(list1,pivotPos,back);
		return front;
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		if (front < back)
        {
            int pivotPoint = partition(list1, front, back);
            
            quickSort(list1, front, pivotPoint-1);
            quickSort(list1, pivotPoint+1, back);
        }
	}
	public static void combSort(int[]list1)
	{
		int n=list1.length;
		int gap=n;
		boolean swapped=true;
		
		while(gap!=1 ||swapped==true)
		{
			gap=getNextGap(gap);
			swapped =false;
			for(int i=0;i<n-gap;i++)
			{
				if(list1[i]>list1[i+gap])
				{
					intSwap(list1,i,i+gap);
					swapped=true;
				}
			}
		}
	}
	public static int getNextGap(int num)
	{
		int gap = (num*10)/13;
		 
	    if (gap < 1)
	    {
	        return 1;
	    }
	    return gap;
	}
	private static void intSwap(int[] arr, int i, int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	private static void printIntArray(int[]list)
	{
		for(int i=0;i<list.length;i++)
		{
			System.out.print("["+list[i]+"] ");
		}
	}
}
