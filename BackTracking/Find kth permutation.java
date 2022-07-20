class Solution {
    
    public static int fact(int n){
        
        if(n==0) return 1;
        
        return n * fact(n-1);
    }
    
    public static String kthPermutation(int n,int k) {
        // code here
        
        String ans = "";
        
        ArrayList<Integer>digits = new ArrayList<>();
        
        for(int i=0;i<n;i++) digits.add(i+1);
        
        int num = n, perm = k;
        int curr_fact = fact(num-1);
        
        for(int i=0;i<n-1;i++){
            
            int index = perm/curr_fact;
            
            if(perm%curr_fact == 0) index--;
            
            int curr_digit = digits.get(index);
            digits.remove(index);
            ans+=Integer.toString(curr_digit);
            
            perm = perm - (curr_fact * index);
            curr_fact /= (num-1);
            num--;
            
        }
        ans += Integer.toString(digits.get(0));
        
        return ans;
    }
}
        