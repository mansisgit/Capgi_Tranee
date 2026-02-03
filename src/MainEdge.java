import java.util.*;

class Edge implements Comparable<Edge> {
    int u;
    int v;

    // Constructor: store nodes in increasing order
    public Edge(int a, int b) {
        this.u = Math.min(a, b);
        this.v = Math.max(a, b);
    }

    // For duplicate detection in Set
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Edge)) return false;
        Edge edge = (Edge) o;
        return u == edge.u && v == edge.v;
    }

    @Override
    public int hashCode() {
        return Objects.hash(u, v);
    }

    // For sorting edges
    @Override
    public int compareTo(Edge other) {
        if (this.u != other.u) {
            return this.u - other.u;
        }
        return this.v - other.v;
    }

    // Required output format
    @Override
    public String toString() {
        return "From node " + u + " To node " + v;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // number of edges
        Set<Edge> set = new HashSet<>();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            set.add(new Edge(a, b)); // duplicates auto-removed
        }

        // Convert to list for sorting
        List<Edge> result = new ArrayList<>(set);
        Collections.sort(result);

        // Output unique edges in sorted order
        for (Edge e : result) {
            System.out.println(e);
        }

        sc.close();
    }
}




