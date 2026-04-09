

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        // 1. Keep track of which strings we have already grouped
        boolean[] used = new boolean[strs.length];

        for (int i = 0; i < strs.length; i++) {
            if (used[i]) continue; // Skip if already part of a group

            List<String> currentGroup = new ArrayList<>();
            currentGroup.add(strs[i]);
            used[i] = true;

            // 2. Look for all other anagrams of strs[i] in the remaining array
            for (int j = i + 1; j < strs.length; j++) {
                // Use "isAnagram(strs[i], strs[j])" instead of "strs[i].isAnagram(strs[j])"
                if (!used[j] && isAnagram(strs[i], strs[j])) {
                    currentGroup.add(strs[j]);
                    used[j] = true; // Mark as used so it's not grouped again
                }
            }
            result.add(currentGroup);
        }
        return result; // Move return outside the loop
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
