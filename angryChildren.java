/* Problem Statement
*
* Bill Gates is on one of his philanthropic journeys to a village in Utopia. 
* He has N packets of candies and would like to distribute one packet to each of the K children in the village 
* (each packet may contain different number of candies). To avoid any fighting among the children, he would like to pick 
* K out of N packets, such that unfairness is minimized.
* Suppose the K packets have (x1, x2, x3,....xk) candies in them, 
* where xi denotes the number of candies in the ith packet, then 
* we define unfairness as max(x1,x2,...xk) - min(x1,x2,...xk)
* where max denotes the highest value amongst the elements, and 
* min denotes the least value amongst the elements. 
* Can you figure out the minimum unfairness and print it?
*/

import java.util.*;

public class angryChildren {
    
    private static int[] bubbleSort(int[] arr) {
        if (arr.length < 2) {
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            boolean hasSwapped = false;
            for (int j = 1; j < arr.length; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                    hasSwapped = true;
                }
            }
            if (!hasSwapped) {
                return arr;
            }
        }
        return arr;
    }
    
    private static int max (int[] arr, int k) {
        int max = arr[0];
        for (int i = 1; i < k; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    
    private static int min (int[] arr, int k) {
        int min = arr[0];
        for (int i = 1; i < k; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        arr = bubbleSort(arr);
        System.out.println(max(arr, k) - min(arr, k));
    }
}