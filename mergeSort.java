/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    // time complexity: O(nlogn)
    // space complexity: O(n)
    public static int[] divideAndConquer(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int n = (arr.length+1)/2;
        int m = arr.length - n;
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        System.arraycopy(arr, 0, arr1, 0, n); // 0 1 2 3 4
        System.arraycopy(arr, n, arr2, 0, m); // 5 6 7 8 9
        for (int i: arr) {
            System.out.print (i+" ");
        }
        System.out.println();
        
        for (int i: arr1) {
            System.out.print (i+" ");
        }
        
        System.out.print("; ");
        for (int j: arr2) {
            System.out.print(j+" ");
        }
        System.out.println();
        
        int[] a = divideAndConquer(arr1);
        int[] b = divideAndConquer(arr2);
        int[] res = sortArray(a,b);
        
        System.out.println();
        return res;
    }
    
    // time complexity: O(n+m)
    // space complexity: O(n+m)
    public static int[] sortArray(int[] a, int b[]) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] res = new int[a.length+b.length];
        while(i < a.length && j < b.length ){
            if (a[i] < b[j] ) {
                res[k++] = a[i++];
            }
            else {
                res[k++] = b[j++];
            }
        }
        while (i < a.length) {
            res[k++] = a[i++];
        }
        while (j < b.length) {
            res[k++] = b[j++];
        }
        return res;
    }
    
	public static void main(String[] args) {
	    int[] arr = new int[]{38,27,43,3,9,82,10};
	    int[] sortedArray = divideAndConquer(arr);
	   // for (int i: sortedArray) {
		  //  System.out.println(i);
	   // }
	}
}
