package Test;

public class Test_Practice {

	public static void main(String[] args) 
	{
      int n=4258197;
      int sum1=0;
      int sum2=0;
      int sum3=0;
      int sum4=0;
     
      
     if(n>0) 
     {
    int rem=n%10;
     sum1=sum1+rem;
       n=n/10; 
      } 
     System.out.println(n);
     System.out.println(sum1);
     
     if(n>0)
     {
    	 int rem=n%10;
         sum2=sum2+rem;
           n=n/10; 
     }
     System.out.println(sum2);
	
	 if(n>0)
     {
    	 int rem=n%10;
         sum3=sum3+rem;
           n=n/10; 
     }
     System.out.println(sum3);
     if(n>0)
     {
    	 int rem=n%10;
         sum4=sum4+rem;
           n=n/10; 
     }
     System.out.println(sum4);
     int totalSum=sum1+sum2+sum3+sum4;
     
     System.out.println("total sum of digit number="+totalSum);
	}
}