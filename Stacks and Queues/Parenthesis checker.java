class Solution{
  public:
    // Function to return if the paranthesis are balanced or not
    bool ispar(string x)
    {
        // Your code here
       vector<char>check;
        for(int i=0;i<x.size();i++){
            char c=x[i];
            if(check.size()!=0){
                
            if(c==')' and check.back()=='('){
                check.pop_back();
                continue;
            }
            else if(c=='}' and check.back()=='{'){
                check.pop_back();
                continue;
            }
            else if(c==']' and check.back()=='['){
                check.pop_back();
                continue;
            }
            }

            if(c=='(' or c=='[' or c=='{' ){
                check.push_back(c);
                continue;
            }
            else{
                return false;
            }
            
        }
        if(check.size()==0){

        return true;
        }
        else{
            return false;
        }


        
       
    }

};
