package sorts;

public class ArrayMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void partition(int[] list1, int front, int back)
	{
		
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
			if(front<=back)
			{
				intSwap(list1,front,back);
				front++;
				back--;
			}
		}
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
}
