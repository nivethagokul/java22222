import java.util.Scanner;

public class norepeat {

	public static void main(String[] args) {
		int i;
		int j;
		int count=0;
		Scanner input=new Scanner(System.in);		
		System.out.println("Enter the array size");
		int n=input.nextInt();
		int[] x=new int[n];	
		System.out.println("Enter the array value");
		for(i=0;i<n;i++)
		{
		x[i]=input.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n;j++)
			{
				if(x[i]==x[j])
				{
				count++;	
				}
				
			}
				if(count==1)
				{
					System.out.println(num[i]);
				}	
				count=0;
		}
		