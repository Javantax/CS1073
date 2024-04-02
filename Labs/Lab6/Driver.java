/**
@author Daniyal Khan 3765942
*/

public class Driver{
	public static void main(String[] args){
		IntArrayUtil array = new IntArrayUtil();
		int[] arr1 = {13, 10, 21, 20, 18, 11, 16};
		System.out.println("Max Value: " + array.max(arr1));
		int[] arr2 = {3, -4, 6, 9};
		int[] arr3 = {16, 11, 18, 20 ,21, 10, 13};
		int[] mergedArr = array.join(arr2, arr3);
		System.out.println("Merged Array: " + mergedArr);
		
	}
}
