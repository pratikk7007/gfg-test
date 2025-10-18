
class Solution {
    public int getSecondLargest(int[] arr) {
        if (arr.length < 2) return -1;

        int largest = arr[0];
        int slargest = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                slargest = largest;
                largest = arr[i];
            } else if (arr[i] < largest && arr[i] > slargest) {
                slargest = arr[i];
            }
        }
        return (slargest == Integer.MIN_VALUE) ? -1 : slargest;
    }
}
