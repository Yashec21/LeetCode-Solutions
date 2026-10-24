class Solution 
{
    public boolean isValid(String s) 
    {
        Stack<Character> charStack = new Stack<>();

        char[] charArray = s.toCharArray();

        for(char ch : charArray)
        {
            if(ch == '(' || ch == '{' || ch == '[')
            {
                charStack.push(ch);
            }
            else
            {
                if(charStack.isEmpty())
                {
                    return false;
                }

                char top = charStack.pop();

                if( ch == ')' && top != '(' ||
                    ch == '}' && top != '{' ||
                    ch == ']' && top != '[')
                {
                    return false;
                }
            }
        }

        return charStack.isEmpty();
    }
}