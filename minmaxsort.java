import java.io.*;
import java.util.ArrayList;
public class minmaxsort {
    public static void main(String args[])
{
    ArrayList<Integer>num=new ArrayList<>();
    num.add(1);
    num.add(2);
    num.add(3);
    boolean isminmaxsort=true;
    int size=num.size();
    for(int i=0;i<size-1;i++)
    {
        if(num.get(i)>num.get(i+1))
        {
            isminmaxsort=false;
            break;
        }
    }
    if(isminmaxsort)
    {
        System.out.print("is sorted");
    }
    else{
        System.out.print("is not sorted");
    }
    
}
    
}
