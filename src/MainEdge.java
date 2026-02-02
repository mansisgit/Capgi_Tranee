import java.util.*;

class Edge implements Comparable<Edge> {
    int a, b;

    Edge(int u, int v) {
        a = Math.min(u, v);
        b = Math.max(u, v);
    }

    public int compareTo(Edge e) {
        return a != e.a ? a - e.a : b - e.b;
    }

    public boolean equals(Object o) {
        if (!(o instanceof Edge)) return false;
        Edge e = (Edge) o;
        return a == e.a && b == e.b;
    }

    public int hashCode() {
        return 31 * a + b;
    }

    public String toString() {
        return "From node " + a + " To node " + b;
    }
}
public class MainEdge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Set<Edge> set = new HashSet<>();
        while (n-- > 0)
            set.add(new Edge(sc.nextInt(), sc.nextInt()));

        set.stream().sorted().forEach(System.out::println);
    }
}

