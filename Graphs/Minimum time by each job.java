class Solution{
     
static final int maxN = 100000;
 
static Vector<Integer> []graph = new Vector[maxN];

static int []indegree = new int[maxN];
 
static int []job = new int[maxN];
 
static void make_graph(int u, int v)
{
     
    graph[u].add(v);
 
    indegree[v]++;
}
 
static void printOrder(int n, int m)
{
     
    Queue<Integer> q = new LinkedList<>();
     
    for(int i = 1; i <= n; i++)
    {
        if (indegree[i] == 0)
        {
            q.add(i);
            job[i] = 1;
        }
    }
 
    while (!q.isEmpty())
    {
 
        int cur = q.peek();
 
        q.remove();
 
        for(int adj : graph[cur])
        {
             
            indegree[adj]--;
 
            if (indegree[adj] == 0){
                job[adj] = 1 + job[cur];
                q.add(adj);
            }
        }
    }
 
    for(int i = 1; i <= n; i++)
        System.out.print(job[i] + " ");
    System.out.print("\n");
}
 
public static void main(String[] args)
{
    
    int n, m;
    n = 10;
    m = 13;
     
    for(int i = 0; i < graph.length; i++)
        graph[i] = new Vector<Integer>();
         
    make_graph(1, 3);
    make_graph(1, 4);
    make_graph(1, 5);
    make_graph(2, 3);
    make_graph(2, 8);
    make_graph(2, 9);
    make_graph(3, 6);
    make_graph(4, 6);
    make_graph(4, 8);
    make_graph(5, 8);
    make_graph(6, 7);
    make_graph(7, 8);
    make_graph(8, 10);
 
    printOrder(n, m);
}
}
 
