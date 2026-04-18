class Solution {
    public boolean isPalindrome(String s) {
       s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase(); 
       char[]st  = s.toCharArray();
       int l = 0, h = st.length-1;
       while(l<h){
        if(st[l] != st[h]){
            return false;
        }
        l++;
        h--;
       } 
       return true;
    }
}
