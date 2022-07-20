//Approach using queue
 
public class Solution {
 
    static class Pair {
        int x, y;
        Pair(int i, int j)
        {
            x = i;
            y = j;
        };
    }
 
 
    static boolean isValid(int x, int y, int R, int C)
    {
        if (x < R && y < C && x >= 0 && y >= 0)
            return true;
 
        return false;
    }
 
    static void findShortestPath(int mat[][])
    {
      int R = mat.length, C = mat[0].length;
      
       static int rowNum[] = { -1, 0, 0, 1 };
       static int colNum[] = { 0, -1, 1, 0 };
 
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == 0) {
                    for (int k = 0; k < 4; k++)
                        if (isValid(i + rowNum[k],
                                    j + colNum[k]))
                            mat[i + rowNum[k]]
                               [j + colNum[k]]
                                = -1;
                }
            }
        }
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++) {
                if (mat[i][j] == -1)
                    mat[i][j] = 0;
            }
        }
 
        int dist[][] = new int[R][C];
 
        for (i = 0; i < R; i++) {
            for (j = 0; j < C; j++)
                dist[i][j] = -1;
        }
        Queue<Key> q = new LinkedList<Key>();
 
        for (i = 0; i < R; i++) {
            if (mat[i][0] == 1) {
                q.add(new Key(i, 0));
                dist[i][0] = 0;
            }
        }
 
        while (!q.isEmpty()) {
            Pair k = q.peek();
            q.poll();
 
            int d = dist[k.x][k.y];
 
            int x = k.x;
            int y = k.y;
 
            for (int ki = 0; ki < 4; ki++) {
                int xp = x + rowNum[ki];
                int yp = y + colNum[ki];
                if (isValid(xp, yp, R, C) && dist[xp][yp] == -1
                    && mat[xp][yp] == 1) {
                    dist[xp][yp] = d + 1;
                    q.add(new Key(xp, yp));
                }
            }
        }
        
        int ans = Integer.MAX_VALUE;
        for (i = 0; i < R; i++) {
            if (mat[i][C - 1] == 1
                && dist[i][C - 1] != -1) {
                ans = Math.min(ans, dist[i][C - 1]);
            }
        }
 
        if (ans == Integer.MAX_VALUE)
            return -1;
 
        else 
            return ans;
    }
 
    
