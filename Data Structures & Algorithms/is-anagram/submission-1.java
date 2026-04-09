class Solution {
    public boolean isAnagram(String s, String t) {
    
HashMap<Character , Integer> map = new HashMap<>();
if(s.length()!= t.length()){
    return false;
}
for(char r : s.toCharArray()){
    map.put(r , map.getOrDefault(r,0)+1);
}
for(char p : t.toCharArray()){
if(!map.containsKey(p)){
    return false;
}
map.put(p , map.get(p)-1);


if(map.get(p)<0){
    return false;
}
    }  
    return true;
    }
}
