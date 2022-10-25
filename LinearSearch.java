/*
            -------------------------Linear Search---------------------------

        In this algorithm we simply traverse the whole array one by one until we reach our desired element
        or last element.

           Time Complexity
                            best case- O(1)
                            worst case- O(n)     n-{size of array or number of elements}.
           space Complexity
                            O(1)     constant because it does not use any extra space.
ALGORITHM

        start

            for loop begin from ith index to n-1 index
                        if element at ith index = key element
                                    return or print  element is found
                                    break
             end for loop

             if i = n-1
                    return or print element is not found.

          end



 */

/*
--------------------------------     IMPLEMENTATION      ------------------------
 */

public class LinearSearch {


    public static void linearsearch( int[] arr , int key){

        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){                                           // comparing every element with key
                System.out.println("element is found at index : " + i);
                return ;
            }
        }
        System.out.println("element is NOT found");
    }

    public static void main(String[] args) {

        int[] arr=  { 1,22,33,44,55,6,88,99};

        linearsearch(arr,66);

    }

}
