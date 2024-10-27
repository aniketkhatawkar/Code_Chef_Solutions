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
        
        for(int t = 0; t < test; t++) {
            int n = input.nextInt();
            
            HashMap<Integer, Integer> map = new HashMap<>();
            int arr[]= new int[n];
            
            for(int i = 0; i < n; i++) {
                int key = input.nextInt();
                arr[i]=key;
                map.put(key, 0);
            }
            
            for(int key:arr) {
                int value = input.nextInt();
                map.put(key, Math.max(map.get(key), value));
            }
            
            int ans = 0;
            for(int value : map.values()) {
                if(value > 0) {
                    ans += value;
                }
            }
            
            System.out.println(ans);
		}
	}
}
