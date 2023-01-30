class Solution {
    int[] a;
    public int tri(int x){
		//recurse it until you find the non-zero element
       if(a[x]!=0){
           return a[x];
       }
        a[x]=tri(x-1)+tri(x-2)+tri(x-3);
        return a[x];
    }
    public int tribonacci(int n) {
        if(n==0)return 0;
        if(n==1||n==2)return 1;
        a=new int[n+1];
        a[0]=0;a[1]=1;a[2]=1;a[3]=2;
        
        if(a[n]!=0)return a[n];
        return tri(n);
    }
}