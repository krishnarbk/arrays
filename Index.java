import java.util.*;

public class Index {

public static int findIndex(int d,int[] a){
int count=0;
while(count<5)
	if(a[count]==d)
	{   
	System.out.println(count);
	break;
    }
	else {
	 count++;
}
return -1;
}
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
int[] array= {3,2,4,19,5};
int d;
d=sc.nextInt();
findIndex(d,array);
}
}