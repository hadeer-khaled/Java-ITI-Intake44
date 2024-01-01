import java.util.Random;
import java.util.Arrays;

class GetMinMax {

    public static void linearSearch(int[] arr) {
        long startTime = System.currentTimeMillis();
        System.out.println("------------- Linear Search -------------");
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");
    }

    public static int binarySearch(int[] arr, int key) {
        long startTime = System.currentTimeMillis();
        System.out.println("------------- Binary Search -------------");

        Arrays.sort(arr);
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (key == arr[mid]) {
                long endTime = System.currentTimeMillis();
                System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");
                return mid;
            } else if (key > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        long endTime = System.currentTimeMillis();
        System.out.println("Execution Time: " + (endTime - startTime) + " milliseconds");
        return -1;
    }

    public static void main(String[] args) {
        Random randIntGenerator = new Random();
        int[] intArray = new int[500000];

        for (int i = 0; i < 500000; i++) {
            intArray[i] = randIntGenerator.nextInt();
        }

        linearSearch(intArray);
        binarySearch(intArray, 55);
    }
}

