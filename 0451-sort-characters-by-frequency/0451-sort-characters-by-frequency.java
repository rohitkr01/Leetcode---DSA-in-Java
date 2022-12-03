class Solution {
    public String frequencySort(String s) {
        int[] a=new int[128];
        for(char ch: s.toCharArray()){
            a[ch]++;
        }
        char [] c =new char[s.length()];
        for(int i=0;i<s.length();){
            int max=0;
            int index=0;

        for(int j=0;j<128;j++){
            if(a[j]>max){
                max=a[j];
                index=j;
            }
        }
        while(a[index]>0){
            c[i++]=(char)index;
            a[index]--;
        }    
        }
        return new String(c); 
    }
    /*
    
    //Method -2 
   public String frequencySort(String s) {
        if (s.length() < 3) return s;

        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) map.merge(c, 1, Integer::sum);

        map.entrySet().stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .forEach(entry -> {
                    for (int i = 0; i < entry.getValue(); i++) {
                        sb.append(entry.getKey());
                    }
                });
				
        return sb.toString();
  }  */
}