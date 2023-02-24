import java.io.*;
import java.lang.*;
import java.util.*;
public class Graph {

    ArrayList<Edge> edges = new ArrayList<>();
    HashMap<Integer,Node> adjacencyList= new HashMap<>();

    ArrayList<Node> nodes=new ArrayList<>();

    Integer totalDependency=0;

    ArrayList<Node> tempNodes= new ArrayList<>();


    public void initNodes()
    {
        for(Integer nodeId: adjacencyList.keySet())
        {
            this.nodes.add(this.adjacencyList.get(nodeId));
            totalDependency+=this.adjacencyList.get(nodeId).dependencyCount;

        }
    }

    public  void sortOnDependencyCount()
    {
        
    }




}
