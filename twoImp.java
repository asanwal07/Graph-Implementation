import java.io.*;
import java.util.*;
import java.io.BufferedInputStream;

public class twoImp {
      public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int vtces = Integer.parseInt(br.readLine());

            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < vtces; i++) {
                  graph.add(new ArrayList<>());
            }

            int edges = Integer.parseInt(br.readLine());

            for (int i = 0; i < edges; i++) {
                  String parts[] = br.readLine().split(" ");
                  int p1 = Integer.parseInt(parts[0]);
                  int p2 = Integer.parseInt(parts[1]);

                  // graph.get(p1).add(p2);
                  // graph.get(p2).add(p1);

                  Addvtces(graph, p1, p2);
            }

            for (int i = 0; i < vtces; i++) {
                  System.out.println(i + "->" + graph.get(i));
            }
      }

      public static void Addvtces(ArrayList<ArrayList<Integer>> graph, int source, int dest) {
            graph.get(source).add(dest);
            graph.get(dest).add(source);
      }
}