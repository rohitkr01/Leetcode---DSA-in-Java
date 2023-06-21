class Solution {
    
    //Method -1
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        
        int i =0, j = str.length()-1;
        while(i<=j){
            
           char left = str.charAt(i) , right = str.charAt(j);
           if((left < 97 || left > 122) && (left<48 || left > 57 )){
               i++;
               continue;
           }
                
            if( (right < 97 || right > 122) && (right<48 || right > 57 )){
                j--;
                continue;
            }
           
            if(str.charAt(i)!=str.charAt(j)){
                return false;
            }  
            i++;
            j--;
        }
        return true;
    }
    
    //Method -2
    
//     public boolean isPalindrome(String s) {
//         if(s.length()==0 || s == null)  return true;
        
//         s = s.replaceAll("^a-zA-Z0-9","").toLowerCase();
//         s = s.replace(" ","");
        
//         System.out.println(s);
//         int i=0,j=s.length()-1;
//         while(i<=j){
//             if(s.charAt(i)!=s.charAt(j))  return false;
            
//             i++;
//             j--;
//         }
//         return true;
//     }
}