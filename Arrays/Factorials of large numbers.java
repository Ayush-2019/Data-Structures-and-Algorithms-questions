class Solution {
    static ArrayList<Integer> factorial(int n){
        //code here
        
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        ans.add(1);
        int carry = 0;
        
        for(int i=2;i<=n;i++){
            
            ArrayList<Integer>temp = new ArrayList<Integer>();
            
            for(int j = ans.size()-1;j>=0;j--){
                
                int curr = ans.get(j)*i+carry;
                
                temp.add(0, curr%10);
                
                carry = curr/10;
            }
            
            while(carry!=0){
                temp.add(0,carry%10);
                carry = carry/10;
            }
            
            ans = temp;
            
        }
        
        return ans;
    }
}
