public class MiniMaxi {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] a= {3,2,4,19,5};
int max=0;
int min=a[0];
for(int i=0;i<5;i++)
{
	if(a[i]>max)
		max=a[i];	
}

for(int i=0;i<5;i++)
{
	if(a[i]<min)
		min=a[i];	
}
System.out.println(max);
System.out.println(min);
}
}