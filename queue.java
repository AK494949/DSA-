public class queue {
   static int size;
    static int front =-1;
    static int rear=-1;
    static int queue[];
    queue(int size)
    {
        this.size=size;
    queue=new int[size];
    }
public void enqueue(int value)
{
if(rear==size-1)
{
    System.out.print("queue is full");
}
else{
if(front==-1)
{
    front=0;
}
    rear++;
    queue[rear]=value;
    System.out.println(value+" ");   

}
 
}
public static void dequeue()
{
if(front==-1||front>rear)
{
    System.out.print("queue is empty");
}
else{
    
    System.out.println("dequeue:"+queue[front]);
  front++;
    size--;
}
}
public static int front()
{
    if(front==-1)
    {
        System.out.print("queue is empty");
        return -1;
    }
    return queue[front];
}
public static int raer()
{
    if(rear==-1)
    {
        System.out.print("queue is empty");
        return -1;
    }
    return queue[rear];
}
static int size()
{
 if(front==-1)
 {
    return 0;
 }
 return rear-front+1;
}
public static void main(String args[])
{
   queue q=new queue(5);
   q.enqueue(10);
      q.enqueue(20);
         q.enqueue(30);
          q.enqueue(40);
                 
          q.dequeue();
        System.out.println("size:"+q.size);
          System.out.println("front:"+q.front);
          System.out.println("raer:"+q.rear);
 System.out.println("size:"+q.size);
}
    
}
