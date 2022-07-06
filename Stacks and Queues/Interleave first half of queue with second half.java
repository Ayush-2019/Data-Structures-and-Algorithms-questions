class Solution{

public void Interleave_Queue(){  
Queue<Integer> ans = new LinkedList<Integer>();
Queue<Integer> temp = new LinkedList<Integer>();
    int halfSize = ans.size() / 2; // Queue size should be even
 
    
    for (int i = 0; i < halfSize; i++) {
        temp.push(ans.front());
        ans.pop();
    }
 
    while (!temp.isEmpty()) {
        ans.push(temp.front());
        ans.push(ans.front());
        ans.pop();
        temp.pop();
    }
}
}
