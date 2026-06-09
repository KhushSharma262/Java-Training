import java.util.ArrayList;
import java.util.List;

class Graph {
    private final int V; // number of vertices
    private final List<List<Integer>> adjList; // adjacency list

    // Constructor
    public Graph(int v) {
        V = v;
        adjList = new ArrayList<>(v);
        for (int i = 0; i < v; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    // Method to add an edge to the graph
    public void addEdge(int src, int dest) {
        adjList.get(src).add(dest); // Add dest to src's list.
        adjList.get(dest).add(src); // Add src to dest's list (for undirected graph)
    }

    // Method to print the graph
    public void printGraph() {
        for (int i = 0; i < V; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(" -> " + neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);

        graph.printGraph();
    }
}
