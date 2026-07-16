class Solution {
    public boolean hasDuplicate(int[] nums) {
        int n=nums.length;
        Map <Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
            if(m.get(nums[i])>=2) return true;
        }
        return false;   
    }
}