class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> arr = new ArrayList<>();
        boolean[] used = new boolean[strs.length];
        for(int i = 0; i<strs.length; i++){
            if(used[i] == true){
                continue;
            }
            List<String>abe = new ArrayList<>();
            abe.add(strs[i]);
            used[i] = true;
            for(int j = i+1; j<strs.length; j++){
                if(!used[j] && isAnagram(strs[i] , strs[j])){
                    abe.add(strs[j]);
                    used[j] = true;
                }
            }
                arr.add(abe);
            
        }
        return arr;
    }
      public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        
        HashMap<Character, Integer> map = new HashMap<>();
        for (char r : s.toCharArray()) {
            map.put(r, map.getOrDefault(r, 0) + 1);
        }
        for (char p : t.toCharArray()) {
            if (!map.containsKey(p)) return false;
            map.put(p, map.get(p) - 1);
            if (map.get(p) < 0) return false;
        }
        return true;
    }
}

