import java.io.*;
import java.lang.reflect.Array;
import java.util.*;

public class oneImp {
      public static void main(String[] args) throws Exception {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int vtces = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

            for (int i = 0; i < vtces; i++) {
                  graph.add(new ArrayList<>());
            }

            int edges = Integer.parseInt(br.readLine());

            for (int i = 0; i < edges; i++) {
                  String[] parts = br.readLine().split(" ");
                  int v1 = Integer.parseInt(parts[0]);
                  int v2 = Integer.parseInt(parts[1]);
                  graph.get(v1).add(v2);
                  graph.get(v2).add(v1);
            }

            for (int i = 0; i < vtces; i++) {
                  System.out.println(i + "->" + graph.get(i));
            }

      }
}
// 7
// 8
// 0 1 10
// 1 2 10
// 2 3 10
// 0 3 10
// 3 4 10
// 4 5 10
// 5 6 10
// 4 6 10

// // ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
// // int nodes = 5;

// // for (int i = 0; i < nodes; i++) {
// // graph.add(new ArrayList<>());
// // }

// // // adding starts here

// // graph.get(0).add(1);
// // graph.get(0).add(2);

// // graph.get(1).add(2);
// // graph.get(2).add(3);
// // graph.get(3).add(4);

// // graph.get(4).add(5);

// // for (int i = 0; i < nodes; i++) {
// // System.out.println(i + "->" + graph.get(i));
// // }
// // int vertices = 7; // 0 1 2 3 4 5 6

// ArrayList<ArrayList<Integer>> graph2 = new ArrayList<>();

// Scanner sc = new Scanner(System.in);

// int vertices = sc.nextInt();
// int edges = sc.nextInt();

// for (int i = 0; i < vertices; i++) {
// graph2.add(new ArrayList<>());

// }
// for (int i = 0; i < edges; i++) {
// String instr = sc.nextLine();
// String[] fruits = instr.split(",");

// int a = Integer.parseInt(fruits[0]);
// int b = Integer.parseInt(fruits[1]);

// graph2.get(a).add(b);
// graph2.get(b).add(a);
// }

// for (int i = 0; i < vertices; i++) {
// System.out.println(i + "->" + graph2.get(i));
// }