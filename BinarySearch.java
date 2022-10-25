/*
    ------------------------------ BINARY SEARCH -----------------------------------


                Step-by-step Binary Search Algorithm:
            We basically ignore half of the elements just after one comparison.

       -     Compare x with the middle element.
       -    If x matches with the middle element, we return the mid-index.
       -    Else If x is greater than the mid-element, then x can only lie in the right half subarray after the mid-element.
       -      So we recur for the right half.
       -    Else (x is smaller) recur for the left half.

Time Complexity
                   O(log(n))

space Complexity
                    O(1)

 */
/*
-------               IMPLEMENTATION                 -----------

Binary Search Algorithm can be implemented in the following two ways

Iterative Method
Recursive Method

Hear we is the Recursive Method
 */


public class BinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int x) {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }
        // We reach here when element is not present
        // in array
        return -1;
    }

    public static void main(String[] args) {

        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;
        int x = 10;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);


    }
}
