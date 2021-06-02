public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 100, -5, -10, 7};
        System.out.println(largestContiguousSum(arr1));


    }
    public static int largestContiguousSum(int[] arr1) {
        int currentSum = 0;
        int bestSum = 0;
        for (int i = 0; i < arr1.length; i++) {
            currentSum = currentSum + arr1[i];
            if (currentSum > bestSum) {
                bestSum = currentSum;
            }
            if (currentSum < 0) {
                currentSum = 0;
            }

        }
        return bestSum;

    }

}
