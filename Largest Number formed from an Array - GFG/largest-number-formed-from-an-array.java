//{ Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            String[] arr = br.readLine().trim().split(" ");

            String ans = new Solution().printLargest(arr);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    String printLargest(String[] arr) {
        // code here
        Arrays.sort(arr,(a,b)->{
            String s1 = a+b;
            String s2 = b+a;
            
            if(s1.compareTo(s2)>0)  return 1;
            
            else if(s2.compareTo(s1) > 0)  return -1;
            
            else return 0;
        });
        
        StringBuilder sb = new StringBuilder();
        for(int i= arr.length -1 ;i>=0;i--){
            sb.append(arr[i]);
        }
        
        return sb.toString();
    }
}