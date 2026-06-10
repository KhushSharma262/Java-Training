import java.util.ArrayList;
import java.util.List;

class adjList {
    private final int numVertices;
    private final List<List<Integer>> adjList;

    public adjList(int numVertices) {
        this.numVertices = numVertices;
        adjList = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int src, int dest) {
        if (src < 0 || src >= numVertices || dest < 0 || dest >= numVertices) {
            throw new IllegalArgumentException("Vertex index out of range");
        }
        adjList.get(src).add(dest);
        adjList.get(dest).add(src); // For undirected graph
    }

    public void printGraph() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print("Vertex " + i + ":");
            for (Integer neighbor : adjList.get(i)) {
                System.out.print(" " + neighbor);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        adjList graph = new adjList(9);
        graph.addEdge(0, 1);
        graph.addEdge(0, 7);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 6);
        graph.addEdge(4, 7);
        graph.addEdge(5, 6);
        graph.addEdge(7, 8);

        graph.printGraph();
    }
}
