import java.util.*;
class Graphs{
    private Map<Integer,List<Integer>>adj;
    public Graphs()
    {
        adj=new HashMap<>();

    }
    public void addVertex(int nodenum)
    {
        adj.putIfAbsent(nodenum,new ArrayList<>());

    }
    public void addEdges(Integer source,int dest)
    {
        addVertex(source);
        addVertex((dest));
        adj.get(source).add(dest);
       adj.get(dest).add(source);


    }
    public void print()
    {
        for(int node:adj.keySet())
        {
            System.out.println(node+"connect to"+adj.get(node));
        }
    }
    public static void main(String args[])
    {
        Graphs g=new Graphs();
        g.addEdges(1, 2);
        g.addEdges(2, 4);
         g.addEdges(2, 3);
        g.addEdges(3, 7);
         g.addEdges(4, 3);
        g.addEdges(8, 2);
        g.print();
    }
}