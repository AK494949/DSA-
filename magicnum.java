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

    int temp=n;
    while(temp>9)
    {
    int sum=0;
    while(temp>0)
    {
        int rem=temp%10;
        sum=sum+rem;
    temp=temp/10;
    
    }
    temp=sum;
    }
  if(temp==1)
  {
      System.out.print("magic number");
  }
  else{
      System.out.print("not");
  }
    
    }
}