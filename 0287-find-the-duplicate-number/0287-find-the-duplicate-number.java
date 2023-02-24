class Solution {
    public int findDuplicate(int[] nums) {
        int dup=0;
        HashMap<Integer, Integer> map = new HashMap();
        for(int i=0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for(int i=0 ; i<nums.length; i++){
            int num= nums[i];
            if (map.containsKey(num)){
                dup= map.get(num);
                if(dup==i)continue;
                return  nums[i];
            }
        }
        
        return dup;
    }
}