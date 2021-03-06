package lopps_and_arrays;

public class ArrayInReverseOrder {

    /*3. Program to print the elements of an array in reverse order
    In this program, we need to print the elements of the array in reverse order that is;
    the last element should be displayed first, followed by second last element and so on.

    Program to print the elements of an array in reverse order
            Algorithm
    STEP 1: START
    STEP 2: INITIALIZE arr[] = {1, 2, 3, 4, 5}
    STEP 3: PRINT "Original Array:"
    STEP 4: REPEAT STEP 5 for(i=0; i<arr.length ; i++)
    STEP 5: PRINT arr[i]
    STEP 6: PRINT "Array in reverse order"
    STEP 7: REPEAT STEP 8 for(i= arr.length-1; i>=0; i--)
    STEP 8: PRINT a[i]
    STEP 9: END*/

    public static void main(String[] args) {

        int arr[] = {1, 2, 3, 4, 5};
        System.out.print("Original Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.print("\n" + "Array in reverse order: ");
        for (int i = arr.length - 1; i >=0; i--) {
            System.out.print(arr[i] + " ");
        }

    }

}
