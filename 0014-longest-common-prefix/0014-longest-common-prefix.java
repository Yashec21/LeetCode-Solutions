class Solution 
{
    public String longestCommonPrefix(String[] str) 
    {
        StringBuilder common = new StringBuilder();

        if(str.length == 0)
        {
            return "";
        }

        for(int i = 0; i < str[0].length(); i++)
        {
            boolean matched = true;

            for(int j = 1; j < str.length; j++)
            {
                if(i >= str[j].length())
                {
                    matched = false;
                    break;
                }
                
                if(str[0].charAt(i) == str[j].charAt(i))
                {
                    matched = true;
                }
                else
                {
                    matched = false;
                    break;
                }
            }

            if(matched == false)
            {
                break;
            }
            else
            {
                common.append(str[0].charAt(i));
            }
        }

        return common.toString();
    }
}