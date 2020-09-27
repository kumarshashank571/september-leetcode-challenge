class Solution {
    class Edge {
        public String e;
        public Double v;

        public Edge(String e, Double v) {
            this.e = e;
            this.v = v;
        }
    }

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, List<Edge>> g = new HashMap<>();
        for (int i = 0; i < equations.size(); i++) {
            List<String> eq = equations.get(i);
            addEdge(g, eq.get(0), eq.get(1), values[i]);
            addEdge(g, eq.get(1), eq.get(0), 1 / values[i]);
        }

        double[] res = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            List<String> q = queries.get(i);
            res[i] = dfs(g, new HashSet<>(), q.get(0), q.get(1));
        }

        return res;
    }

    private double dfs(Map<String, List<Edge>> g, Set<String> v, String s, String e) {
        if (v.contains(s)) {
            return -1;
        }
        if (!g.containsKey(s) || !g.containsKey(e)) {
            return -1;
        }
        if (s.equals(e)) {
            return 1;
        }
        v.add(s);

        for (Edge edge : g.get(s)) {
            if (edge.e.equals(e)) {
                return edge.v;
            } else {
                double d = dfs(g, v, edge.e, e);
                if (d != -1) {
                    return edge.v * d;
                }
            }
        }
        return -1;
    }

    private void addEdge(Map<String, List<Edge>> g, String s, String e, double v) {
        if (!g.containsKey(s)) {
            g.put(s, new ArrayList<>());
        }
        g.get(s).add(new Edge(e, v));
    }
}
