##decimal to Binary##

class Main {
    public static void main(String[] args) {
    int n=56;
    String res=" ";
    int k=0;
    while(n>0)
    {
        k=n%10;//k=n&1
        res=k+res;
        n=n/10;//n=n>>1
    }
    System.err.print(res);
    }
}
===================================================================================================
##DecimalToBinary##

class Main {
    public static void main(String[] args) {
    int n=101;

    int k,d=0;
    int dec=0;
    while(n>0)
    {
        k=n%10;
        dec+=k*(int)Math.pow(2,d);
        n=n/10;
        d++;
    }
    System.err.print(dec);
    }
}
===================================================================================================
##Anouther one Decimal to Binary##Using Strings

class Main {
    public static void main(String[] args) {
        
   String s="111";
   int i,pow=0,res=0;
   for(i=s.length()-1;i>=0;i--)
   {
       if(s.charAt(i)=='1')
       {
         res+=(int)Math.pow(2,pow);
        
       }
        pow++;
   }
   System.out.print(res);
    }
}