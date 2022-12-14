
public class LinearSearch {
	public static int linearSearch (int[]arr, int key,int size ) {
		for (int i=0; i<size; i++) {
			if (arr[i] == key ) {
				return i;
			}
		}
		
	return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {101,20,30,51,701,90};
		int size =array.length;
		int keyElement =30;
		int position =linearSearch( array,keyElement,size);
		if(position ==-1) {
			System.out.println("element is not present in given array");
		}
		else {
			System.out.println("element found at array index" + position);
			
		}
		
		

	}

	//public void implementationOfLinearSearch() {
		// TODO Auto-generated method stub
		
	}

}
