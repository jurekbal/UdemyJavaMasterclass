package sekcja8;

import java.util.Arrays;

public class ReverseArrayChallenge {

    private static int[] array = {6, 9, 10, 45, 2, 0};

    public static void main(String[] args) {
        System.out.println(Arrays.toString(array));
        reverse();
        System.out.println(Arrays.toString(array));
    }

    private static void reverse() {
        int temp;
        for (int i = 0; i < array.length / 2; i++) {
            temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
    }


}
