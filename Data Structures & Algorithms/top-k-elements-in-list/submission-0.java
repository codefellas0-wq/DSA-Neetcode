class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
       
        HashMap<Integer , Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
List<Integer> [] bucket = new ArrayList[n+1];
for(int i : map.keySet()){
    int freq = map.get(i);
    if(bucket[freq] == null){
bucket[freq] = new ArrayList<>();
    }
bucket[freq].add(i);
}
int[] ans = new int[k];
int index = 0;
for(int i = n; i>= 0 && index<k; i--){
    if(bucket[i] != null){
        for(int arrs : bucket[i]){
            ans[index++] = arrs;
            if(index == k){
                break;
            }
        }
    }

}
return ans;
    }
}
