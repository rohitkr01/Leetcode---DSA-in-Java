class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)  return false;
        
        int num = Math.abs(x);
        int revNum = 0;
        while(num >0){
            int rem = num%10;
            revNum = revNum*10 + rem;
            num /=10;
        }
        
        return revNum== Math.abs(x);
    }
}