
public class BubbleSort {
	static void  performBubbleSort (int[]arr) {
		int size =arr.length;
		int temp =0;
		
		for (int i=0; i<size;i++){
		for( int j=1; j< (size-1);j++) {
		if (arr[j-1]> arr[j]) {
			//swap elements
			temp= arr[j-1];
			arr[j-1] =arr[j];
			arr[j]=temp;
		}
		}
		}
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {100,20,30,54,2,8,56,98,752};
		System.out.println("Array Before Bubble sort ");
		for (int i =0; i < arr.length; i++){
		
		System.out.print(arr[i]+" ");
		}
		System.out.println();
		//sorting array element using BubbleSort
		performBubbleSort(arr);
		System.out.println("Array after Bubble sort");
		for(int i=0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		}

}
