package MS;
import java.util.*;

public class PrerequsiteTsks {
	static int[] indeg(ArrayList<ArrayList<Integer>> graph)
    {
        int degrees[] = new int[graph.size()];
 
        for (ArrayList<Integer> neighbors : graph)
            for (int neigh : neighbors)
                degrees[neigh]++;
 
        return degrees;
    }
     
    static boolean isPossible(int numTasks, Vector<pair> prerequisites)
    {
        ArrayList<ArrayList<Integer>> graph = make_graph(numTasks, prerequisites);
        int degrees[] = indeg(graph);
 
        for (int i = 0; i < numTasks; i++) {
            int j = 0;
            for (; j < numTasks; j++)
                if (degrees[j] == 0)
                    break;
 
            if (j == numTasks)
                return false;
 
            degrees[j] = -1;
            for (int neigh : graph.get(j))
                degrees[neigh]--;
        }
 
        return true;
    }
}
