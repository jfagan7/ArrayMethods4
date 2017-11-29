package sorts;

public class ArrayMethods4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public static void partition(int[] list1, int front, int back)
	{
		int i=0;
		int j=0;
		int pivotPos=0;
		int pivot=list1[0];
		
		while(i<list1.length)
		{
			while(list1[i]<= pivot && i<pivot)
			{
				i++;
			}
			while(list1[j]>pivot && i<list1.length)
			{
				j++;
			}
			
		}
	}
	public static void quickSort(int[] list1, int front, int back)
	{
		
	}
}
