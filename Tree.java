     import java.util.*;
    class Main{
static class Tree {
    int data;
    Tree left;
    Tree right;
    Tree(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

    public static void inorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }
    public static void preorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
          System.out.println(root.data);
        preorder(root.left);
      
        preorder(root.right);
    }
    public static void postorder(Tree root)
    {
        if(root==null)
        {
            return;
        }
        postorder(root.left);
      
        postorder(root.right);
          System.out.println(root.data);
    }
    public static void main(String args[])
    {
    Tree root=new Tree(1);
    root.left=new Tree(5);
    root.right=new Tree(6);
    root.left.left=new Tree(2);
    root.left.right=new Tree(7);
    System.out.println("In order");
    inorder(root);
    System.out.println("preorder");
   preorder(root);
    System.out.println("postorder");
   postorder(root);


    }
    
}
