package retest;

import java.util.Random;

public class MaxMin {
    public static void main(String[] args) {
        RandomNum rn = new RandomNum();
        int[] arr = new int[10];
        arr = rn.makeRandom();
        int max = arr[0];
        int min = arr[0];

        System.out.print("[");
        for (int i =0; i<10; i++) {

            System.out.printf("%d",arr[i]);
            if (i != 9) System.out.print(",");
            if (max < arr[i]) max = arr[i];
            if (min > arr[i]) min = arr[i];
        }
        System.out.print("]");
        System.out.printf("[Max=%d, Min=%d]",max,min);

    }
}

class RandomNum {
    int[] arr = new int[10];
    Random r = new Random();
    int[] makeRandom() {
         for (int i = 0; i<10; i++) {
             arr[i] = r.nextInt(51,101);
         }
         return arr;
    }
}


