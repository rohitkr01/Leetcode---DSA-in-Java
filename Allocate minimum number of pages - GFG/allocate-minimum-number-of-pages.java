//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		
		while(t-->0)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    
		    for(int i=0;i<n;i++)
		    {
		        a[i]=sc.nextInt();
		    }
		    int m=sc.nextInt();
		    Solution ob = new Solution();
		    System.out.println(ob.findPages(a,n,m));
		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution 
{
    //Function to find minimum number of pages.
    public static int findPages(int[]A,int N,int M)
    {
        //Your code here
        if(M>N)  return -1;
        
        int ans = -1;
        int sum =0, max =0;
        for(int val : A){
            sum +=val;
            max = Math.max(max, val);
        }  
        
        int lo = max , hi = sum;
        while(lo <= hi){
            int mid = lo + ( hi - lo)/2;
            
            if(ifPossible(A, mid, M)){
                ans = mid;
                hi = mid -1;
            }
            else{
                lo = mid+1;
            } 
        }
        return ans;
    }
    
    public static boolean ifPossible(int[] A , int mid , int M){
        int pages =0;
        int totalStd = 1;
        for(int i =0 ; i < A.length ;i++){
            if(A[i] > mid){
                return false;
            }
            if(pages+ A[i] > mid){
                totalStd++;
                pages = A[i];
            }else{
                pages += A[i];
            }
        }
        return  totalStd <= M;
    }
};