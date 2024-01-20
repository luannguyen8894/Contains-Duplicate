class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap <Integer,Integer> myHM = new HashMap <Integer,Integer>();
        for(int i = 0; i< nums.length; i++)
        {
            if(myHM.containsKey(nums[i]) == true)
                return true;
            else
                myHM.put(nums[i], 1);
        }
        return false;
    }
}
