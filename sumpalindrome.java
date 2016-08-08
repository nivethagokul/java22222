public class sumpalindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		       int i,a=0, sum=0;
		       i=Integer.parseInt(args[0]);         
		       while(i!=0)
		       {
		           a=i%10;
		           i=i/10;
		           sum=sum+a;
		       }
		       System.out.println(sum);
	


		       int r;
		       int rev = 0;
		     int n1=sum;
		       while(sum>0) {
		        r=sum%10;
		        rev=rev*10+r;
		        sum=sum/10;
		       }
		       
		       if(rev==n1)
		    		    {
		        System.out.println("The number is Palindrome Number.");
		       }
		       else {
		        System.out.println("The number is not a Palindrome Number.");
		       }
		      } 
		      
		     }
		    
		   
		
	



