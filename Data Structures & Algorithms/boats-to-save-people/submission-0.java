class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int l = 0, h = people.length-1; 
        int count = 0;
        
        while(l<=h){
            if(people[l]+people[h] > limit){
                count++;
                h--;
            }
            else if(people[l]+people[h]<=limit){
                count++;
                l++;
                h--;
            }
        }
        return count;
    }
}