package ds.BinarySearch.easy;

//Smallest index such that arr[i] > X
public class UpperBound {
    public static void main(String[] args) {
        int[] arr = {3, 5, 8, 15, 19};
        int x = 4;
        System.out.println(arr[findUpperBound(arr, x)]);
    }

    public static int findUpperBound(int[] arr, int x) {
        int low = 0, high = arr.length - 1;
        int ans = -1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > x) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return ans;
    }
}
