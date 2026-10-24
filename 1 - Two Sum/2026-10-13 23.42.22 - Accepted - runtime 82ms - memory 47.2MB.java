class Solution 
{
    public int[] twoSum(int[] nums, int target)
    {
        int sum = 0;
        int add = 0;

        int i = 0, j = 0;

        for(i = 0; i < nums.length; i++)
        {
            sum = nums[i];

            for( j = 0; j < nums.length; j++)
            {
                if(i != j)
                {
                    add = sum + nums[j];

                    if(add == target)
                    {
                        break;
                    }
                }
            }

            if(add == target)
            {
                break;
            }
        }

        return new int[]{i, j};
    }
}