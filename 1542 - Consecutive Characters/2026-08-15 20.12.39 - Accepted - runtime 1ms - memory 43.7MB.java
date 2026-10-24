class Solution {
    public int maxPower(String str) 
    {
        char Arr[] = str.toCharArray();

        int iCount = 1;
        int iMax = 1;

        for(int i = 1; i < Arr.length; i++)
        {
            if(Arr[i] == Arr[i - 1])
            {
                iCount++;
            }
            else
            {
                iCount = 1;
            }

            iMax = Math.max(iCount , iMax);
        }    

        return iMax;
    }
}