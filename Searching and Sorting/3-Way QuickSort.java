class GFG
{

static void swap(int[] arr, int i, int j)
{
	int temp = arr[i];
	arr[i] = arr[j];
	arr[j] = temp;
}
  
static void partition(int a[], int low, int high, int i, int j)
{
	if (high - low <= 1) {
		if (a[high] < a[low])
			swap(a, high, low);
		i = low;
		j = high;
		return;
	}

	int mid = low;
	int pivot = a[high];
	while (mid <= high) {
		if (a[mid] < pivot)
			swap(a, low++, mid++);
		else if (a[mid] == pivot)
			mid++;
		else if (a[mid] > pivot)
			swap(a, mid, high--);
	}

	i = low - 1;
	j = mid;
}
  
static void quicksort(int a[], int low, int high)
{
	if (low >= high)
		return;

	int i=low, j=high;

	partition(a, low, high, i, j);

	quicksort(a, low, i);
	quicksort(a, j, high);
}
}
