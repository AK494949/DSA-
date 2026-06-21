import java.io.*;
import java.util.*;
public class firstrepeat {
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in); 
	int n=5;
	int a[]=new int[n];
	int i,j;
	for(i=0;i<n;i++)
	{
	    a[i]=sc.nextInt();
	}
	 boolean found=false;
	for(i=0;i<n;i++)
	{
	    for(j=i+1;j<n;j++)
	    {
	       
	        if(a[i]==a[j])
	        {
	           System.out.println("element:"+a[i]);
	           found=true;
	           break;
	        }
	   
	}

	}
		if(!found)
	{
	    System.out.print("no repeating element");
	}
	
}
}

    

