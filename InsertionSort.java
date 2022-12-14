
public class InsertionSort {
	public static void performInsertion(int array []) {
		int n =array.length;
		for (int j=1;j<n; j++) {
			int i=j-1;
			int key = array[j];
			while((i>-1)&&(array[i]>key)) {
				array[i+1]=array[i];
				i--;
			}
			array[i+1]=key;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {100,2,4,8,89,32,9};
System.out.println("Array before insertion sort");
for( int i=0; i < arr.length; i++) {
	System.out.print(arr[i]+" ");
	
}
System.out.println();
performInsertion(arr);
System.out.println("After the Insertion sort");
for(int i=0;i<arr.length;i++) {
	System.out.print(arr[i] +" ");
}
	}

}
