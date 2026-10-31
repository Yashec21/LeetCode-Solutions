class Solution 
{
    public int[] plusOne(int[] digits) 
    {
        int i = 0;

        i = (digits.length - 1);

        if(digits[i] < 9)
        {
            digits[i] = digits[i] + 1;

            return digits;
        }
        else 
        {
            while( i >= 0 && digits[i] == 9)
            {
                digits[i] = 0;

                i--;
            }

            if(i >= 0)
            {
                digits[i] = digits[i] + 1;
            }
            else
            {
                int iDigit[] = new int[digits.length + 1];

                iDigit[0] = 1;

                return iDigit;
            }
        }

        return digits;
    }
}