class Compute  
{ 
    
    static int getBitCount(int a)
    {
        int count = 0;
        while (a > 0) {
            if ((a & 1) > 0)
                count += 1;
            a = a >> 1;
        }
        return count;
    }
    
  //Approach 1:- TC:- O(nlogn) SC:- O(1)
    static void sortBySetBitCount(Integer arr[], int n)
    { 
        // Your code goes here
        
        Arrays.sort(arr, new Comparator<Integer>() {
            public int compare(Integer a, Integer b)
            {
                int cnt1 = getBitCount(a);
                int cnt2 = getBitCount(b);
                if (cnt1 == cnt2){
                return 0;
                }else {
                    return cnt2-cnt1;
                }
                }
        });
    }
  
  //Approach 1:- TC:- O(n) SC:- O(n) use List of size 32 and n elements in it
      static void sortBySetBitCountEff(Integer arr[], int n)
    { 
        
        ArrayList<ArrayList<Integer>>count = new ArrayList<>();
   
          for (int i = 0;
                   i < 32; i++)
            count.add(new ArrayList<Integer>());
           
          int setbitcount = 0;
           
          for (int i = 0; i < n; i++)
          {
            setbitcount = getBitCount(arr[i]);
            count.get(setbitcount).add(arr[i]);
          }
         
          int j = 0; 
         
          for (int i = 31; i >= 0; i--)
          {
            ArrayList<Integer> v1 = count.get(i);
             
            for (int p = 0; p < v1.size(); p++)
              arr[j++] = v1.get(p);
          }
        
    }   
  
}
