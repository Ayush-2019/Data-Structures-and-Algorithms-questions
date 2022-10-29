class Compute {
    public String isSubset( long a1[], long a2[], long n, long m) {
        
        HashMap<Long, Integer>map = new HashMap<Long, Integer>();
        
        for(long item : a1){
            
            if(map.containsKey(item)){
                map.put(item, map.get(item)+1);
            }
            else{
                map.put(item, 1);
            }
        }
        
        for(long item : a2){
            if(map.containsKey(item) && map.get(item)>0) {
                map.put(item, map.get(item)-1);
            }
            
            else return "No";
        }
        
        return "Yes";
    }
}
