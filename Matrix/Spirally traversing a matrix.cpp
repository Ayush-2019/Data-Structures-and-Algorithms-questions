class Solution
{   
public:     
    vector<int> spirallyTraverse(vector<vector<int> > matrix, int r, int c) 
    {
        // code here 
        vector<int>ans;
        int i=0,j=0,cn=0;
        int ul2=c,ul1=r,dl2=0,dl1=0;
        while(cn<(r*c)){
            while(j<ul2){
                ans.push_back(matrix[i][j]);
                cn++;j++;
            }
            if(cn==r*c){
                break;
            }
            ans.pop_back();j--;cn--;
            while(i<ul1){
                ans.push_back(matrix[i][j]);
                cn++;i++;
            }
            if(cn==r*c){
                break;
            }
            ans.pop_back();cn--;i--;
            while(j>=dl2){
                ans.push_back(matrix[i][j]);cn++;
                j--;
            }
            if(cn==r*c){
                break;
            }
            ans.pop_back();cn--;j++;
            while(i>=dl1){
                ans.push_back(matrix[i][j]);cn++;
                i--;
            }
            ans.pop_back();i++;cn--;
            i++;j++;
            ul2--;ul1--;
            dl2++;dl1++;
            
        }
        return ans;
        
        
    }
};
