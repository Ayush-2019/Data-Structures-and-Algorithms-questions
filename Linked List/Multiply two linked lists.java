/*Node is defined as
class Node
{
    int data; 
    Node next;
    Node(int data) {
        this.data=data;
        this.next = null;
    }
}*/

class GfG{
  /*You are required to complete this method */
   public long multiplyTwoLists(Node l1,Node l2){
          //add code here.
          
          long a = 0, b = 0, mod = 1000000007;
          long ans = 0;
          
          while(l1!=null){
              a = ((a*10)%mod + l1.data%mod)%mod;
              l1 = l1.next;
          }
          
          while(l2!=null){
              b = ((b*10)%mod + l2.data%mod)%mod;
              l2 = l2.next;
          }
          
          ans = (a*b)%mod;
          
          return ans;
   }
}
