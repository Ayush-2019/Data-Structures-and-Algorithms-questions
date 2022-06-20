import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class TestClass {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-->0){
            
            int n,q;
            n = sc.nextInt();
            q = sc.nextInt();

            ArrayList<ArrayList<Long>>list = new ArrayList<>();

            for(int i=0;i<n;i++){
                ArrayList<Long> pair = new ArrayList<>();

                long a = sc.nextLong(), b = sc.nextLong();

                pair.add(a);
                pair.add(b);
                list.add(pair);
            }

            //sorting the arraylist

            Collections.sort(list, new Comparator<ArrayList<Long>>(){

                public int compare(ArrayList<Long> o1, ArrayList<Long> o2){

                return o1.get(0).compareTo(o2.get(0));

                }

            });

            //merging overlapping pairs

            int idx = 0;

            for(int i=1;i<list.size();i++){
                if(list.get(idx).get(1) >= list.get(i).get(0)) 
                list.get(idx).set(1, Math.max(list.get(idx).get(1), list.get(i).get(1)));

                else {
                    idx++;
                    list.set(idx, list.get(i));
                }

            }

            //final solution

            while(q-->0){
                long k = sc.nextLong();
                boolean flag = false;

                for(int i=0;i<=idx;i++){

                    long range = list.get(i).get(1) - list.get(i).get(0);

                    if(range + 1 >= k){
                        flag = true;
                        System.out.println(list.get(i).get(0) + k-1 );
                        break;
                    }
                    else{
                        k = k- range - 1;
                    }
                }
                if(!flag) System.out.println(-1);
            }
        }
    }
}
