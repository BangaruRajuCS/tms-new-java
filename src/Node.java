import java.util.*;
import java.lang.*;
import java.io.*;

public class Node {
    Integer nodeId;
    Integer dependencyCount=0;

    Integer clashCount=0;

    ArrayList<Integer> sisterNodes = new ArrayList<>();
    ArrayList<Integer> adjacentNodes = new ArrayList<>();

    ArrayList<Integer> preferences= new ArrayList<>();;

    ArrayList<Integer> professors= new ArrayList<>();;

    ArrayList<Integer> students=new ArrayList<>();;

    ArrayList<Integer> tempStudents=new ArrayList<>();;

    Boolean isPlanned=false;

    TimePattern scheduledTimePattern;


    @Override
    public String toString() {
        return "Node{" +
                "nodeId=" + nodeId +
                ", dependencyCount=" + dependencyCount +
                ", clashCount=" + clashCount +
                ", sisterNodes=" + sisterNodes +
                ", adjacentNodes=" + adjacentNodes +
                ", preferences=" + preferences +
                ", professors=" + professors +
                ", students=" + students +
                ", tempStudents=" + tempStudents +
                ", isPlanned=" + isPlanned +
                ", scheduledTimePattern=" + scheduledTimePattern +
                '}';
    }
}
