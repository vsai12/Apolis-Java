package com.java.self;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayPractice {

    static void findFrequency(int[] arr) {
        String res = "";
        Arrays.sort(arr);
        int f = 1;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[i-1]) {
                res += "Element " + arr[i-1] + " occurs " + f + " times, ";
                f = 1;
            }
            else {
                f++;
            }
        }
        res += "Element " + arr[arr.length - 1] + " occurs " + f + " times";
        System.out.print(res);
    }

    static void reverseArr(int[] arr) {
        String res = "";
        for(int i = arr.length - 1; i >= 0; i--) {
            res += arr[i] + ", ";
        }
        System.out.print(res.substring(0,res.length()-2));
    }

    static void printEven(int[] arr) {
        String res = "";
        for(int i = 1; i < arr.length; i+=2) {
            res += arr[i] + ", ";
        }
        System.out.print(res.substring(0,res.length()-2));
    }

    static void printLargest(int[] arr) {
        Arrays.sort(arr);
        System.out.print("The largest element is " + arr[arr.length-1]);
    }

    static void printSmallest(int[] arr) {
        Arrays.sort(arr);
        System.out.print("The smallest element is " + arr[0]);
    }

    static void printLength(int[] arr) {
        System.out.print("The number of elements is " + arr.length);
    }

    static void printSum(int[] arr) {
        int sum = 0;
        for(int i : arr) {
            sum += i;
        }
        System.out.print("The sum of all elements is " + sum);
    }

    static void arrClone(int[] arr) {
        int[] arr2 = arr.clone();
        String res = "The second array after copying: [";
        for(int i : arr2) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void linearSearch(int[] arr, int target) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                System.out.print("The index of " + target + " is " + i);
                return;
            }
        }
    }

    static void binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        do {
            int mid = (low + high) / 2;
            if(arr[mid] == target) {
                System.out.print("The index of " + target + " is " + mid);
                return;
            }
            else if(arr[mid] < target)
                low = mid + 1;
            else
                high = mid - 1;
        } while(low <= high);
    }

    static void selectionSort(int[] arr) {
        for(int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for(int j = i + 1; j < arr.length; j++) {
                if(arr[j] < arr[min])
                    min = j;
            }
            int temp = arr[i];
            arr[i] = arr[min];
            arr[min] = temp;
        }

        String res = "The sorted array: [";
        for(int i : arr) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void bubbleSort(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        String res = "The sorted array: [";
        for(int i : arr) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static int findMissing(int[] arr) {
        Arrays.sort(arr);
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i-1] != 1)
                return arr[i] - 1;
        }
        return arr[0] - 1;
    }

    static void printSecondLargest(int[] arr) {
        Arrays.sort(arr);
        System.out.print("The second largest number is " + arr[arr.length-2]);
    }

    static void separateOddEven(int[] arr) {
        int[] arr2 = new int[arr.length];
        int odd = 0;
        int even = arr.length - 1;
        for(int i : arr) {
            if(i%2 == 1) {
                arr2[odd] = i;
                odd++;
            }
            else {
                arr2[even] = i;
                even--;
            }
        }

        String res = "Odd numbers: [";
        for(int i = 0; i < odd; i++) {
            res += arr2[i] + ", ";
        }
        res = res.substring(0,res.length()-2) + "], Even numbers: [";
        for(int i = odd; i < arr2.length; i++) {
            res += arr2[i] + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void findFirstPeak(int[] arr) {
        if(arr.length <= 1) {
            System.out.print("There is no peak element.");
            return;
        }
        if(arr[0] > arr[1]) {
            System.out.print("The peak element is " + arr[0]);
            return;
        }
        for(int i = 1; i < arr.length - 1; i++) {
            if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                System.out.print("The peak element is " + arr[i]);
                return;
            }
        }
        if(arr[arr.length - 1] > arr[arr.length - 2]) {
            System.out.print("The peak element is " + arr[arr.length-1]);
            return;
        }
        System.out.print("There is no peak element.");
    }

    static void maxDiff(int[] arr) {
        Arrays.sort(arr);
        System.out.print("The maximum difference is " + (arr[arr.length - 1] - arr[0]));
    }

    static void kthSmallest(int[] arr, int k) {
        Arrays.sort(arr);
        System.out.print("The " + k + "rd smallest element is " + arr[k-1]);
    }

    static void removeDupes(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        String res = "The array after removing duplicates: [";
        for(int i : set) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void arrayIntersection(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1) {
            set.add(i);
        }
        Set<Integer> result = new HashSet<>();
        for(int i : arr2) {
            if(set.contains(i)) {
                result.add(i);
            }
        }
        String res = "The intersection of arrays: [";
        for(int i : result) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void arrayUnion(int[] arr1, int[] arr2){
        Set<Integer> set = new HashSet<>();
        for(int i : arr1) {
            set.add(i);
        }
        for(int i : arr2) {
            set.add(i);
        }
        String res = "The union of arrays: [";
        for(int i : set) {
            res += i + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    static void subArrayMaxSum(int[] arr) {
        int max = 0;
        int maxStart = 0;
        int maxEnd = 0;
        int i = 0;
        int currSum = 0;
        int start = 0;
        while(i < arr.length) {
            if(arr[i] + currSum > 0) {
                if(currSum == 0)
                    start = i;
                currSum += arr[i];
                if(currSum > max) {
                    max = currSum;
                    maxStart = start;
                    maxEnd = i;
                }
            }
            else {
                currSum = 0;
            }
            i++;
        }

        String res = "The subarray with the maximum sum: [";
        for(int j = maxStart; j <= maxEnd; j++) {
            res += arr[j] + ", ";
        }
        res = res.substring(0,res.length()-2) + "]";
        System.out.print(res);
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,2,3,1,4,5};
        System.out.print("\nProblem 1 - Input: An array, e.g., [1, 2, 2, 3, 1, 4, 5] Output: ");
        findFrequency(arr1);
        int[] arr2 = {3,7,1,9,5};
        System.out.print("\nProblem 2 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        reverseArr(arr2);
        int[] arr3 = {3,7,1,9,5};
        System.out.print("\nProblem 3 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printEven(arr3);
        int[] arr4 = {3,7,1,9,5};
        System.out.print("\nProblem 4 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printLargest(arr4);
        int[] arr5 = {3,7,1,9,5};
        System.out.print("\nProblem 5 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printSmallest(arr5);
        int[] arr6 = {3,7,1,9,5};
        System.out.print("\nProblem 6 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printLength(arr6);
        int[] arr7 = {3,7,1,9,5};
        System.out.print("\nProblem 7 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printSum(arr7);
        int[] arr8 = {3,7,1,9,5};
        System.out.print("\nProblem 8 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        arrClone(arr8);
        int[] arr9 = {3,7,1,9,5};
        System.out.print("\nProblem 9 - Input: An array, e.g., [3, 7, 1, 9, 5], and target element 7 Output: ");
        linearSearch(arr9,7);
        int[] arr10 = {1,3,5,7,9};
        System.out.print("\nProblem 10 - Input: A sorted array, e.g., [1, 3, 5, 7, 9], and target element 5 Output: ");
        binarySearch(arr10,5);
        int[] arr11 = {3,7,1,9,5};
        System.out.print("\nProblem 11 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        selectionSort(arr11);
        int[] arr12 = {3,7,1,9,5};
        System.out.print("\nProblem 12 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        bubbleSort(arr12);
        int[] arr13 = {1, 2, 3, 4, 6, 7, 8, 9};
        System.out.print("\nProblem 13 - Input: An array, e.g., [1, 2, 3, 4, 6, 7, 8, 9] Output: The missing number is " + findMissing(arr13));
        int[] arr14 = {3,7,1,9,5};
        System.out.print("\nProblem 14 - Input: An array, e.g., [3, 7, 1, 9, 5] Output: ");
        printSecondLargest(arr14);
        int[] arr15 = {1,2,3,4,5,6,7,8,9};
        System.out.print("\nProblem 15 - Input: An array, e.g., [1, 2, 3, 4, 5, 6, 7, 8, 9] Output: ");
        separateOddEven(arr15);
        int[] arr16 = {1,3,5,2,4,6,8};
        System.out.print("\nProblem 16 - Input: An array, e.g., [1, 3, 5, 2, 4, 6, 8] Output: ");
        findFirstPeak(arr16);
        int[] arr17 = {4,2,10,8,7};
        System.out.print("\nProblem 17 - Input: An array, e.g., [4, 2, 10, 8, 7] Output: ");
        maxDiff(arr17);
        int[] arr18 = {4,2,10,8,7};
        System.out.print("\nProblem 18 - Input: An array, e.g., [4, 2, 10, 8, 7], and k = 3 Output: ");
        kthSmallest(arr18, 3);
        int[] arr19 = {3,2,5,2,8,5};
        System.out.print("\nProblem 19 - Input: An array, e.g., [3, 2, 5, 2, 8, 5] Output: ");
        removeDupes(arr19);
        int[] arr20a = {3,2,5,8};
        int[] arr20b = {5,2,9};
        System.out.print("\nProblem 20 - Input: Two arrays, e.g., [3, 2, 5, 8], and [5, 2, 9] Output: ");
        arrayIntersection(arr20a, arr20b);
        int[] arr21a = {3,2,5,8};
        int[] arr21b = {5,7,9};
        System.out.print("\nProblem 21 - Input: Two arrays, e.g., [3, 2, 5, 8], and [5, 7, 9] Output: ");
        arrayUnion(arr21a, arr21b);
        int[] arr22 = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.print("\nProblem 22 - Input: An array, e.g., [-2, 1, -3, 4, -1, 2, 1, -5, 4] Output: ");
        subArrayMaxSum(arr22);


        System.out.println();
    }


}
