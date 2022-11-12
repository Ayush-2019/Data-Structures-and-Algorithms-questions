//Code succesfully submitted using cpp on GFG. Java code not producing 2 decimal places answer, while works on other ide

class Solution {
    
    static class point{
        int x, y;
        
        point(int xc, int yc){
            this.x = xc;
            this.y = yc;
        }
    }
    
    static class line{
        int a, b, c;
        
        line(int ac, int bc, int cc){
            this.a = ac;
            this.b = bc;
            this.c = cc;
        }
    }
    
    public static double compute(point p, double x, double y){
        
        return Math.sqrt(Math.pow((x-p.x),2) + Math.pow((y-p.y),2));
    }
    
    public static double solve(point pts[], int n, line l, double x){
        double res = 0;
        
        double y = -1 * (l.a*x+l.c)/l.b;
        
        for(int i=0;i<n;i++){
            res += compute(pts[i], x, y);
        }
        
        return res;
    }
    
    public static double findOptimumCost(int[] line, int n, int[][] points) {
        // code here
        
        point pts[] = new point[n];
        
        for(int i=0;i<n;i++){
            pts[i] = new point(points[i][0], points[i][1]);
        }
        
        line l = new line(line[0], line[1], line[2]);
        
        int cross = 1;
        
        double low = 1e-6, high = 1e+6;
        
        while(high-low>1e-6+1){
            double mid1 = low + (high-low)/3;
            double mid2 = high - (high-low)/3;
            
            double dist1 = solve(pts, n, l, mid1);
            double dist2 = solve(pts, n, l, mid2);
            
            if(dist1<dist2){
                high = mid2;
            }
            
            else low = mid1;
            
        }
        
        double ans = solve(pts, n, l, (low+high)/2);
        return Math.round(ans*100.0)/100.0;
    }
}
        
