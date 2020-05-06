class Solution {
    public int majorityElement(int[] nums) {
        int j=0,k=0,count2=0;
        int position=-1;
          for( j=0;j<nums.length;j++)
        {
            int count1=0;
            for(k=0;k<nums.length;k++)
            {
                if(nums[j]==nums[k])
                {
                    count1++;
                }
            }
            if(count1>nums.length/2)
            {
            return nums[j];   
            }       
        }
        return 0;  
    }
}