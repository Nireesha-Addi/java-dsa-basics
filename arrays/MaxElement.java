public class MaxElement {

    // Problem: Find the maximum element in an array
    // Time Complexity: O(n)
    // Space Complexity: O(1)

    public static void main(String[] args) {
        int[] arr = {3, 7, 2, 9, 4};

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Maximum element is: " + max);
    }
}

// Edge Case: Works even if array has one element
