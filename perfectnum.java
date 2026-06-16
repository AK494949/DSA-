// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.io.*;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    int i;
    System.err.print("enter nvalue:");
    int n=sc.nextInt();
    int sum=0;
    int pro=1;
    while(n>0)
    {
        int rem=n%10;
        sum=sum+rem;
        pro=pro*rem;
        n=n/10;
    }
    if(sum==pro)
    {
        System.err.print("yes");
        
    }
    else{
        System.err.print("no");
    }
    }
}