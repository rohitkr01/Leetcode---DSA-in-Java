class Solution {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        
        if(n<2)  return true;
        
        if(Character.isUpperCase(word.charAt(0))){
            boolean isFirstCharacter = Character.isUpperCase(word.charAt(1));
            for(int i = 2; i < n ; i++){
                boolean currentCharState = Character.isUpperCase(word.charAt(i));
                if(currentCharState != isFirstCharacter) return false;
            }
        }else{
            for(int i = 1; i < n ; i++){
                if(Character.isUpperCase(word.charAt(i))) return false;
            }
        }
        return true;
    }
}