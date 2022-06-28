class Solution
{
    static boolean minZeroes(int mid, int n)
    {
        int temp = mid, count = 0, f = 5;
        while (f <= temp)
        {
            count += temp / f;
            f = f * 5;
        }
        return (count >= n);
    }
     
    static int findNum(int n)
    {
        
        int low = 0;
        int high = 5 * n;
     
        while (low < high)
        {
            int mid = (low + high)/2;
     
            if (minZeroes(mid, n))
                high = mid;
            else
                low = mid+1;
        }
     
        return low;
    }
}
