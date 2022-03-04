package chapterSeven;
// [{3, 4, 2, 1, 6, 4, 9, 7, 0}]
// identify the smallest number you assume  would be in the array
//go through the array of numbers
//compare each element in the array with  that smallest value that is identified
// arrange each element such that it goes from the smallest to the largest

import java.util.Arrays;

public class SortingArray {
    private static int temp;

    public static void main(String[] args) {
        int [] array = {3, 4, 2, 1, 6, 4, 9, 7, 0};
        for (int i = 0; i < array.length-1; i++){
            if (array[i+1] < array[i]) {
                temp = array[i];
                array[i] = array[i+1];
                array[i+1] = temp;
                for (int j = i; j >= 0; j--){
                    if (array[j] > array[j+1]){
                        temp = array[j];
                        array[j] = array[j+1];
                    }

                }
            }
        }
    }

    }

