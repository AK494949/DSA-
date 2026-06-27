public class middlelinked {


    static class node{
    int data;
    node next;
    public node(int data)
    {
        this.data=data;
        this.next=null;
    }
}
   public static void findmiddle(node head)
{
    node fast=head;
    node slow=head;
    while(fast!=null&&fast.next!=null)
    {
        slow=slow.next;
        fast=fast.next.next;
    }
   System.out.print(slow.data);
}

public static void main(String args[])
{   
    node head=new node(1);
   
    head.next=new node(2);
    head.next.next=new node(3);
    head.next.next.next=new node(4);
        head.next.next.next.next=new node(5);
 
   findmiddle(head);


    
}
    
}
 

