import java.i0.*;
import java.util.Scanner;
public class specnum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String n=sc.next();
        int k=sc.nextInt();
        //String res=" ";
        k=k%n.length();
        String res=n.substring(n.length()-k)+n.substring(0,n.length()-k);
        System.out.print(res);

       
    }
    
}
