import java.io.*;
import java.lang.*;
import java.util.*;
public class Helper {

    public static ArrayList<Node> getSections() throws FileNotFoundException {
        ArrayList<Node> sections= new ArrayList<>();
        /*
            Input Format
            no of Nodes
            Node id
            Professor Ids
            Student Ids
            PrefTimePattern Ids
            sister Ids
         */
        File file = new File("/home/edtex/Desktop/sectionsInput.txt");
        Scanner sc = new Scanner(file);
        Integer N=Integer.parseInt(sc.nextLine());
        for(int i=0;i<N;i++)
        {
            Node node= new Node();
            node.nodeId=Integer.parseInt(sc.nextLine());
            String professorIds=sc.nextLine().strip();
            String professorIdsArray[]= professorIds.split(" ");
            for(String professor:professorIdsArray)
            {
                node.professors.add(Integer.parseInt(professor));
            }

            String students=sc.nextLine();
            String studentsArray[]= students.split(" ");
            for(String student: studentsArray)
            {
                node.students.add(Integer.parseInt(student));
            }

            String prefTimePatterns=sc.nextLine();
            String prefTimePatternsArray[]= prefTimePatterns.split(" ");
            for(String pattern : prefTimePatternsArray)
            {
                node.preferences.add(Integer.parseInt(pattern));
            }
            String sisterIds=sc.nextLine();
            String sisterIdsArray[]=sisterIds.split(" ");
            for(String sisterId : sisterIdsArray)
            {
                if(!sisterId.equals("*"))
                    node.sisterNodes.add(Integer.parseInt(sisterId));
            }

            sections.add(node);

        }
        return  sections;
    }
}
