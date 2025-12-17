package set1;
import java.util.*;

class selection {
    public static void display(int arr[]) {
        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]) {
        int arr[] = {7, 8, 1, 3, 2};


        for(int i=0; i<arr.length-1; i++) {
            int sm = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j] < arr[sm]) {
                    sm = j;
                }
            }
            int temp = arr[sm];
            arr[sm] = arr[i];
            arr[i] = temp;
        }

        display(arr);
    }

}
