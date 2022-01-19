package lopps_and_arrays;

public class PrintAllArrayElements {

    /*1. Program to print the elements of an array
    This is a simple program to create an array and then to print it's all elements.

    Program to print the elements of an array
    Here, 1, 2, 3, 4 and 5 represent the elements of the array.
    These elements can be accessed through their corresponding indexes, 1.e., 0, 1, 2, 3 and 4.
    Algorithm
    STEP 1: START
    STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}.
            STEP 3: PRINT "Elements of given array:"
    STEP 4: REPEAT STEP 5 for(i=0; i<arr.length; i++)
    STEP 5: PRINT arr[i]
    STEP 6: END*/

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Elements of given array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
