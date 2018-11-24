import java.util.Arrays;

public class Ques1 
{
	public int findClosetSum(int[] num, int target) 
	{
		int finalSum=0, i,j,k,n=num.length;
		if(n<3)
			return 0;
		int checker=Integer.MAX_VALUE;
		int sum, absoluteDifference;
		Arrays.sort(num);
		for( i=0;i<n-2;i++)
		{
			j=i+1;
			k=n-1;
			for(j=i+1,k=n-1;j<k;)//i,j and k cannot be equal 
			{
				sum=num[i]+num[j]+num[k];
				absoluteDifference=Math.abs(sum-target);
				if(absoluteDifference<checker)
				{
					finalSum=sum;
					checker=absoluteDifference;
				}
				if(sum>target)
					k--;
				else 
					j++;
			}
		}
		return finalSum;
	}


}
