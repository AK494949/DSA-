import java.io.*;
import java.util.*;
public class binarysearch{
    public static int binary(int a[],int key)
    {
        int mid;
        int low=0;
        int high=a.length-1;
        while(low<=high)
        {
         mid= low+(high-low)/2;
        
        if(a[mid]==key)
        {
            return mid;
        }
        else if(key>a[mid])
        {
            low=mid+1;
        }
        else
        {
            high=mid-1;
        }
    }

        return -1;
    }
    public static void main(String args[])
    {
        int n=7;
        int a[]={10,20,30,40,50,60,80};
        int key=50;
        int res=binary(a,key);
      
        
        if(res==-1)
        {
            System.out.println("element not found");
        }
        else{
            System.out.println("elements found:"+res);
        }
    }


}