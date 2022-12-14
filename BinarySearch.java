
public class BinarySearch {
	public static  void Search(int arr[] ,int left, int right,int num ) {
		if (left> right) {
			System.out.println(" numner:" + num +"can't be found in array");
			return;
			
			
		}
		int mid =  (left -right)/2;
		if (arr[mid]==num) {
			System.out.println(num+"is found at the index"+mid);
		}
		else if (arr[mid]>num) {
			Search(arr,left, mid-1,num);
		}
		else {
			Search(arr,left,mid+1,num);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] arr= {2,6,7,8,10,12,14,16,18,20};
Search (arr,arr.length-1,10);
	}

}
