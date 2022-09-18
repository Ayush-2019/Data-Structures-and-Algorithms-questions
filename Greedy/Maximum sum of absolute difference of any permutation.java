class Solution {
  public static int maxSum(int[] arr, int n) {
    Arrays.sort(arr);
    int i = 0, j = n - 1, sum = 0;
    boolean check = true;
    while(i < j) {
      sum += Math.abs(arr[i] - arr[j]);
      if(check) {
        i++;
      } else {
        j--;
      }
      check = !check;
    }
    sum += Math.abs(arr[0] - arr[n/2]);
    return sum;
  }

}
