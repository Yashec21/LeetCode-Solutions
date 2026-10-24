class Solution 
{
    public int lengthOfLastWord(String str)
    {
        int count = 0;

        str = str.trim();

        str = str.replaceAll("\\s+"," ");

        String Tokens[] = str.split(" ");

        count = Tokens.length;

        count = Tokens[count - 1].length();

        return count;
    }
}