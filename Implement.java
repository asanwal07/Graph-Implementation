import java.io.*;
import java.util.*;

public class Implement {

      private static ArrayList<ArrayList<Integer>> graph;

      public Implement(int vtces) {
            graph = new ArrayList<>();
            for (int i = 0; i < vtces; i++) {
                  graph.add(new ArrayList<>());
            }
      }

      public static void Addvertices(int src, int dest) {
            graph.get(src).add(dest);
            graph.get(dest).add(src);
      }

      public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            int vertices = sc.nextInt();
            int edges = sc.nextInt();

            Implement graph = new Implement(vertices);

            for (int i = 0; i < edges; i++) {
                  int source = sc.nextInt();
                  int dest = sc.nextInt();

                  Implement.Addvertices(source, dest);
            }

      }

}
