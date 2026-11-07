class Solution 
{
    public int maxPower(String str) 
    {
        int count = 1;
        int maxCount = 1;

        int i = 0;

        for(i = 1; i < str.length(); i++)
        {
            if(str.charAt(i) == str.charAt(i - 1))
            {
                count++;
            }
            else
            {
                count = 1;
            }

            maxCount = Math.max(maxCount, count);
        }

        return maxCount;
    }
}