class Solution {
    public int maxNumEdgesToRemove(int n, int[][] edges) {
        Arrays.sort(edges, (a, b) -> b[0] - a[0]);
        
        int edgeAdd = 0;
        
        UnionFind alice = new UnionFind(n);
        UnionFind bob = new UnionFind(n);
        
        for (int[] edge : edges) {
            int type = edge[0];
            int a = edge[1];
            int b = edge[2];
            
            switch (type) {
                case 3:
                    if (alice.unite(a, b) | bob.unite(a, b)) {
                        edgeAdd++;
                    }
                    break;
                case 2:
                    if (bob.unite(a, b)) {
                        edgeAdd++;
                    }
                    break;
                case 1:
                    if (alice.unite(a, b)) {
                        edgeAdd++;
                    } 
                    break;
            }
        }
        
        return (alice.united() && bob.united()) ? edges.length - edgeAdd : -1;
    }
    
    private class UnionFind {
        int[] component;
        int distinctComponents;
        
        public UnionFind(int n) {
            component = new int[n+1];
            for (int i = 0; i <= n; i++) {
                component[i] = i;
            }
            distinctComponents = n;
        }
        // unite. For example, if previously we have component {0, 4, 4, 4, 4, 6, 7, 7}, then invoke this method with a=1, b=5, then after invoke, {0, 4, 4, 4, 5, 7, 7, 7}
        private boolean unite(int a, int b) {
            if (findComponent(a) != findComponent(b)) {
                component[findComponent(a)] = b;
                distinctComponents--;
                return true;
            }
            
            return false;
        }
        
        // find and change component
        // for example, if previously we have component:{0, 2, 3, 4, 4, 6, 7, 7}, then after invoke this method with a=1, the component become {0, 4, 4, 4, 4, 6, 7, 7}
        private int findComponent(int a) {
            if (component[a] != a) {
                component[a] = findComponent(component[a]);
            }
            return component[a];
        }
        
        private boolean united() {
            return distinctComponents == 1;
        }
        
    }
}