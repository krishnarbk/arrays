import java.util.*;
public class DuplicateArray
{
	public static void main(String[] args) {
		int[] a= {2,3,4,5,6,2,9,9,3};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=a[n-1];
					n--;
				}
			}
		}
		for(int i=0;i<n;i++)
		System.out.print(a[i]+" ");
	}
}
	
