public class printrep
	{
	public static void main(String[] args)
	{
	int[] b=new int[]{1,2,4,5,7,4,8};
	for(int i=0;i<b.length;i++)
	{
		for(int j=i+1;j<b.length;j++)
		{
			if((b[i])==(b[j]))
			{
				System.out.println(b[i]);
			}
		}
	}
}
}