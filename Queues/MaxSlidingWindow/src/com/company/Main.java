package com.company;

/*Input: A long array A[], and a window width w. Output: An array B[], B[i] is the
maximum value from A[i] to A[i+w-1]*/
public class Main {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int[] maxArr = new int[arr.length];
        int w = 3;
        int lastMaxIndex = -1;
        for (int i = 0; i < arr.length; i++) {
            if (i > arr.length - w)
                maxArr[i] = maxArr[arr.length - w];
          else if (lastMaxIndex == -1 || lastMaxIndex < i || lastMaxIndex > i + w - 1) {
                lastMaxIndex = findMax(arr, i, w);
                maxArr[i] = arr[lastMaxIndex];
            } else if ( arr[lastMaxIndex] > arr[i + w - 1]) {
                maxArr[i] = arr[lastMaxIndex];
            } else {
                maxArr[i] = arr[i + w - 1];
                lastMaxIndex = i + w - 1;
            }
        }

        for (int x : maxArr) {
            System.out.print(x + ";");
        }
    }

    public static int findMax(int[] arr, int stIndex, int windowLength) {
        int max = Integer.MIN_VALUE;
        int maxIndex = -1;
        while (windowLength > 0) {
            if (arr[stIndex] > max) {
                max = arr[stIndex];
                maxIndex = stIndex;
            }
            stIndex++;
            windowLength--;
        }
        return maxIndex;
    }
}
