
public class SlectionSort {
	public static void performSelectionSort(int [] arr) {
		for (int i=0; i < arr.length-1;i++) {
			int index=i;
			for (int j =i+1;j<arr.length;j++) {
				if (arr[j]<arr[index]) {
					index=j;//searching for lowest index
				}
			}
			int smallerNumber =arr[index];
			arr[index] =arr[i];
			arr[i]= smallerNumber;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,2,4,8,10,80,45,54,90};
		System.out.println("Array before selection sort");
		for(int i=0; i<arr.length ;i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		performSelectionSort(arr);
		System.out.println("Array after the slectionsort");
		for(int i=0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}

	}

}
