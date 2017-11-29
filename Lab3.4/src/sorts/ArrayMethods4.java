package sorts;

public class ArrayMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]test1= {7,15,4,6,2,8,9,12,14};
		printIntArray(test1);
		System.out.println();
		System.out.println();
		ArrayMethods4.partition(test1, 4, 7);
		printIntArray(test1);
	}
	public static void partition(int[] list1, int front, int back)
	{
		int pivotPos=0;
		while(front<=back)
		{
			int pivot=list1[0];
			while(list1[front]<=pivot)
			{
				front++;
			}
			while(list1[back]>pivot)
			{
				back--;
			}
				intSwap(list1,front,back);
				front++;
				back--;
		}
		intSwap(list1,pivotPos,0);
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
