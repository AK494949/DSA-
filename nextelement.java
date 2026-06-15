##print (N+1) digit##using bitshift##

public class Main {
    static int addone(int n)
    {
        int m=1;
        while((n&m)!=0)
        {
         n=n^m;
         m=m<<1;
        }
        n=n^m;
      return n;
        
    }
    public static void main(String[] args) {
     int n=5;
      System.err.print(addone(n));
    }
}