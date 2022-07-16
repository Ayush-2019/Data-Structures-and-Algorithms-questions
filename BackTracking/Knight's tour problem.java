class Solution {
    static boolean canMove(int x, int y, int sol[][])
    {
        return (x >= 0 && x < N && y >= 0 && y < N
                && sol[x][y] == -1);
    }
  
    static boolean solve(int x, int y, int N,  int movei,
                               int sol[][], int xMove[],
                               int yMove[])
    {
        int k, next_x, next_y;
        if (movei == N * N)
            return true;
 
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];
            if (canMove(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei;
                if (solve(next_x, next_y, N, movei + 1,
                                sol, xMove, yMove))
                    return true;
                else
                    sol[next_x][next_y]
                        = -1; 
            }
        }
 
        return false;
    }
 
    static int[][] knightTour(int N)
    {
        int sol[][] = new int[8][8];
 
        for (int x = 0; x < N; x++)
            for (int y = 0; y < N; y++)
                sol[x][y] = -1;
 
        int xMove[] = { 2, 1, -1, -2, -2, -1, 1, 2 };
        int yMove[] = { 1, 2, 2, 1, -1, -2, -2, -1 };
 
        sol[0][0] = 0;
 
        if (!solve(0, 0, N, 1, sol, xMove, yMove)) {
            //return grid with -1's
            return sol;
        }
        else
            //return grid of answer
            return sol;
 
    }
 
