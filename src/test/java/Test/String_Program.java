package Test;

import java.util.LinkedHashSet;

public class String_Program {

	public static void main(String[] args) 
	{
       String s="my name is amit kumar uuuuu";
       
           String[] str = s.split(" ");
           
        LinkedHashSet<Character> set = new   LinkedHashSet<Character>();
        
        for(int i=0;i<s.length();i++)
        {
        	set.add(s.charAt(i));
        }
        System.out.println("after removing duplicates"+set);
        
        for(Character ch:set)
        {
        	int count=0;
        	for(int j=0;j<s.length();j++)
        	{
        		if(ch==s.charAt(j))
        		{
        			count++;
        		}
        	}
        	
         if(count>=1)
         {
        	 System.out.print(ch+" "+count);
         }
        }
	}

}
