import java.lang.*;
import java.io.*;
import java.util.*;

public class Main {
    static Graph graph = new Graph();
    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Node> sections= Helper.getSections();
        for(Node node:sections)
        {
            graph.adjacencyList.put(node.nodeId,node);
        }
        calculateDependency();




        System.out.println(graph.nodes);

    }

    public static void calculateDependency()
    {
        //calculating clashMatrix
        int matrix[][]=new int[100][100];

        for(int i=0;i<100;i++) for(int j=0;j<100;j++) matrix[i][j]=0;

        for(int i=1;i<100;i++)
        {
            if(!graph.adjacencyList.containsKey(i)) continue;
            for(int j=i+1;j<100;j++)
            {
                if(!graph.adjacencyList.containsKey(j)) continue;

                ArrayList<Integer> commonStudents= new ArrayList<>(graph.adjacencyList.get(i).students);
                commonStudents.retainAll(graph.adjacencyList.get(j).students);
                matrix[i][j]=commonStudents.size();
                Edge edge = new Edge();
                edge.node1=i;
                edge.node2=j;
                edge.weight=matrix[i][j];
                graph.edges.add(edge);
                graph.adjacencyList.get(i).dependencyCount+=edge.weight;
                graph.adjacencyList.get(j).dependencyCount+=edge.weight;
                graph.adjacencyList.get(i).adjacentNodes.add(j);
                graph.adjacencyList.get(j).adjacentNodes.add(i);

            }
        }
        graph.initNodes();
    }







}