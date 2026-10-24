class Solution 
{
    public boolean isPalindrome(String s)
    {
        boolean bFlag = true;

        int j = 0;
        int i = 0;

        s = s.trim();

        s = s.toLowerCase();
        
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        char Original[] = s.toCharArray();
        char reversed[] = new char[ Original.length];

        for( i = ( Original.length - 1), j = 0; i >= 0 && j < Original.length; i--,j++)
        {
            reversed[j] =  Original[i];
        }

        for (i = 0; i <  Original.length; i++)
        {
            if ( Original[i] != reversed[i])
            {
                bFlag = false;
                break;
            }
        }

        return bFlag;

    }
}