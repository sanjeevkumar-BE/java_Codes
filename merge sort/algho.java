package practice;

import java.util.Arrays;

public class algho {
    public static void main(String[] args) {
        int[] arr={22,11,44,77,2,6,1,7,88,33};
        System.out.println("Original array");
        print_array(arr);
        mergesort(arr);
        System.out.println("Sorted array");
        print_array(arr);

    }
    public static void mergesort(int[] arr){
        if (arr ==null || arr.length<=1){
            return;
        }
        int n= arr.length;
        int mid=n/2;

        int [] left= Arrays.copyOfRange(arr,0,mid);
        int [] right=Arrays.copyOfRange(arr,mid,n);

        mergesort(left);
        mergesort(right);
        merge(arr,left,right);
    }
    public static void merge(int[] arr, int[] left, int[] right){
        int i=0,j=0,k=0;

        while(i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }

            while(i<left.length){
                arr[k++]=left[i++];
            }
            while(j<right.length){
                arr[k++]=right[j++];
            }
        }

    public static void print_array(int[] arr) {
        for(int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}

