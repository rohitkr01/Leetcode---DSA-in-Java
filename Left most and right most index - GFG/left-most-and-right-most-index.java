//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;

class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}

class GFG {
	public static void main(String[] args) throws IOException
	{
	        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int t =
            Integer.parseInt(br.readLine().trim()); // Inputting the testcases
        while(t-->0)
        {
            long n = Long.parseLong(br.readLine().trim());
            long a[] = new long[(int)(n)];
            // long getAnswer[] = new long[(int)(n)];
            String inputLine[] = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                a[i] = Long.parseLong(inputLine[i]);
            }
            long k = Long.parseLong(br.readLine().trim());
            
            Solution obj = new Solution();
            pair ans = obj.indexes(a, k);
            if (ans.first == -1 && ans.second == -1)
                System.out.println(-1);
            else
                System.out.println(ans.first+" "+ans.second);
            
        }
	}
}


// } Driver Code Ends


//User function Template for Java

/*
class pair  {  
    long first, second;  
    public pair(long first, long second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}
*/

class Solution {
    public pair indexes(long v[], long x){
        int start =0, end = v.length-1;
        while(start<=end){
            int mid = start + (end -start)/2;
            if(v[mid]==x){
                int i = mid, j = mid;
                long first = mid, last = mid;
                while(i >=0 && v[i]==x){
                    first = i;
                    i--;
                }
                while(j <= end && v[j]==x){
                    last = j;
                    j++;
                }
                return new pair(first,last);
            }
            else if(v[mid] < x){
                start = mid+1;
            }else 
            end = mid-1;
        }
        return new pair(-1,-1);
    }
    
    
    // public pair indexes(long v[], long x){
    //     // Your code goes here
    //     long first =-1, last = -1;
    //     boolean isfirst = true;
    
    //     for(int i =0; i < v.length;i++){
    //         if(isfirst && v[i]==x){
    //             first = i;
    //             last =i;
    //             isfirst = false;
    //         }
    //         else if(v[i]==x){
    //             last =i;
    //         }
    //     }

    //     return new pair(first,last);
    // }
    
    // public pair indexes(long v[], long x){
    //     long first = firstIndex(v,x) , last = lastIndex(v,x);
        
    //     return new pair(first, last);
    // }
    // public long firstIndex(long v[], long x){
    //     long result = -1;
    //     int start = 0 , end = v.length-1;
    //     while(start <= end){
    //         int mid = start + (end - start)/2;
    //         if(v[mid]==x){
    //             result = mid;
    //             end = mid=1;
    //         }
    //         else if(v[mid]< x){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return result;
    // }
    // public long lastIndex(long v[], long x){
    //     long result = -1;
    //     int start = 0 , end = v.length-1;
    //     while(start <= end){
    //         int mid = start + (end - start)/2;
    //         if(v[mid]==x){
    //             result = mid;
    //             start = mid+1;
    //         }
    //         else if(v[mid]< x){
    //             start = mid+1;
    //         }
    //         else{
    //             end = mid-1;
    //         }
    //     }
    //     return result;
    // }
    
}