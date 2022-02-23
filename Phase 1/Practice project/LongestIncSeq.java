package madhu;
public class LongestIncSeq {
	 static int max_ref;
	
	 static int _lis(int arr[], int n)
	 	{
	 			if (n == 1)
	 			return 1;
	 int res, max = 1;
	 		for (int i = 1; i < n; i++) {
	 			res = _lis(arr, i);
	 			if (arr[i - 1] < arr[n - 1] && res + 1 > max)
	 				max = res + 1;
	 		}
	    if (max_ref < max)
	 			max_ref = max;
	 		return max;
	 	}
	 	static int lis(int arr[], int n)
	 	{
	 		max_ref = 1;
	 	_lis(arr, n);
	 return max_ref;
	 	}
	 	public static void main(String args[])
	 	{
	 		int arr[] = {25,16,50,70,89,14,99,100};
	 		int n = arr.length;
	 		System.out.println("Length of lis is "
	 						+ lis(arr, n) + "\n");
	 	}
}

