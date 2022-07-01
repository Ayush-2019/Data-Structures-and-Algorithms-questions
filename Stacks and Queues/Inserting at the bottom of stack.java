Class Solution{

Stack<Character> st = new Stack<Character>();

static void solve(char x){

    if(st.isEmpty())
        st.push(x);

    else{
       
        char c = st.peek();
        st.pop();
        solve(x);

        st.push(c);
    }
}
}
