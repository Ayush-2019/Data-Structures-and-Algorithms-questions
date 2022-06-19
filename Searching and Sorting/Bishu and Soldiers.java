import java.util.*;
 
class TestClass {

static int binary_search(int[] arr , int n , int p){

if(arr[n-1] <= p) return n;

if(arr[0] > p) return 0;

int low = 0;

int high = n-1;

int mid;

while(low<=high){

mid = (low+high)/2;

if(arr[mid] == p && arr[mid+1] > p) return mid+1;

if(arr[mid] <= p )

low = mid+1;

else high = mid-1;

}

return 0;
}

public static void main(String args[] ) throws Exception {


Scanner s = new Scanner(System.in);

int n = s.nextInt();

int[] arr = new int[n];

int[] sum = new int[n+1];

for(int i=0 ; i<n ; i++){

arr[i] = s.nextInt();

}

Arrays.sort(arr);

for(int i=1 ; i<=n ; i++){

sum[i] += sum[i-1] + arr[i-1];

}

 

int k = s.nextInt();

 

while(k-->0){
 

int p = s.nextInt();

int ind = binary_search(arr,n,p);

int res = ind>0?sum[ind]:0;

System.out.println(ind+" "+res);

}

}

}

