class test2 {
     public static int firstUniqChar(String s) {
        
        int ans = Integer.MAX_VALUE;
     
        for(char c='a'; c<='z';c++){
           
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }

      
        return ans==Integer.MAX_VALUE?-1:ans;
    }
    public static void main(String args[]){
        System.out.println(firstUniqChar("leetcode"));
         System.out.println(firstUniqChar("loveleetcode"))    ;
    }  
}