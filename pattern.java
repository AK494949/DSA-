public class pattern {
    public static void main(String args[])
    {
        int n=10;
        int i,j;
        for(i=1;i<=n;i++)
        {
           for(j=1;j<=n;j++)
            {

            if(i==1||i==n ||j==1||j==n)
            {
                System.err.print(j);
            }
            else{
                System.out.print(" ");
            }
      }
            System.out.println();
        }
    }
    
}
