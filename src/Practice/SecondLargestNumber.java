package Practice;

public class SecondLargestNumber {
public static int findsecondlargest(int a[], int total)
{
	for(int i=0;i<total;i++)
	{
		for(int j=i+1;j<total;j++)
		{
			if(a[i]>a[j])
			{
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	return a[total-2];
	
}
public static void main(String[] args) {
	int a[]= {9,0,1,2,8,7,3,6};
	System.out.println(findsecondlargest(a,7));
}
}
