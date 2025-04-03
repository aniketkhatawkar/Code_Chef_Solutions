/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input = new Scanner(System.in);
		
		int test = input.nextInt();
		
		for(int t=0; t<test; t++) {
		    
		    int n = input.nextInt();
		    int k = input.nextInt();
		    
		    int arr[] = new int[n];
		    
		    for(int i=0; i<n; i++){
		        arr[i]= input.nextInt();
		    }
		    
		    int trip = 0, sum = 0;
            if (isValid(arr, k)) {
                for (int i = 0; i < n; i++) {
                    int e = arr[i];
                    sum += e;
                    if (sum > k) {
                        sum = e;
                        trip++;
                    }
                    else if (sum == k) {
                        trip++;
                        sum = 0;
                    }

                }

                if (sum != 0) {
                    trip++;
                }

                System.out.println(trip);
            }
            else {
                System.out.println("-1");
            }
		}
	}
	
	public static boolean isValid(int[] arr, int k) {
        for (int a: arr) {
            if (a > k) {
                return false;
            }
        }
        return true;
    }
}
