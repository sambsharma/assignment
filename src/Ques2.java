import java.util.Stack;

public class Ques2 
{
	public int checkRedundantBraces(String str)
	{
		if (str.length() == 0) 
		{
			return 0;
		}
		if(str == null || str.length() == 0) return 0;
		Stack<Character> stackObject = new Stack<Character>();
		int i = 0;

		for(i=0;i<str.length();i++)
		{
			char c = str.charAt(i);
			if(c !=')') 
			{
				stackObject.push(c);
			}
			else if(c == ')')
			{
				if(stackObject.peek() == '(') 
				{
					return 1;
				}
				else
				{
					while(!stackObject.isEmpty() && stackObject.peek()!= '(') 
					{
						stackObject.pop();
					}
					stackObject.pop();
				}
			}
		}
		return 0;
	}
}
