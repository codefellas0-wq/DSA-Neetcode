class Solution {
    public boolean isAnagram(String s, String t) {
char [] st = s.toCharArray();
char[] pt = t.toCharArray();
Arrays.sort(st);
Arrays.sort(pt);
return Arrays.equals(st,pt);
    }
}
