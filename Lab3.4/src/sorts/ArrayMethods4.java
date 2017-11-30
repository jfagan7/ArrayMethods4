package sorts;

public class ArrayMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test1= {7,15,31,4,6,2,8,9,12,1,14};
		printIntArray(test1);
		System.out.println();
		System.out.println();
		System.out.print(ArrayMethods4.partition(test1, 0, 10));
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
