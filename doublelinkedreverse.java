public class doublelinkedreverse {
    static class node{
        int data;
        node next;
        node prev;
    
    
     node(int data)
   {
       this.data=data;
   }
    }
    
   public static node reversedb(node head)
   {
     
   node curr=head;
   node temp=null;

   while(curr!=null)
   {
       temp=curr.prev;
       curr.prev=curr.next;
       curr.next=temp;
       curr=curr.prev;
       
   }
   return temp.prev;
   }
   public static void print(node head)
   {
       while(head!=null)
       {
           System.out.print(head.data+" <-> ");
              head=head.next;
       }
       System.out.print("null");
  
   }
   public static void main(String args[])
   {
       node h1=new node(1);
       node h2=new node(2);
      node h3=new node(3);
         node h4=new node(4);
      node h5=new node(5);
     
      h1.next=h2;
      
      h2.next=h3;
      h3.next=h4;
      h4.next=h5;
    h2.prev = h1;
    h3.prev = h2;
    h4.prev = h3;
    h5.prev = h4;
    node head=h1;

      head=reversedb(head);
      print(head);
      
   }
}
    

