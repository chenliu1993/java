
package com.learning.day1;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1};
        for(int i=1, size=arr.length;i<size;i++) {
            boolean swap = false;
            for(int j=0;j<size-i;j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap = true;
                }
            }
            /*
             * This means all the rest elements are sorted wo can stop in advance
             */
            if(swap==false) {
                break;
            }
        }
        System.out.println(arr);
    }
    
}
