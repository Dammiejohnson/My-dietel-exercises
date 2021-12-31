package chapterSeven;

public class ArrayNumbers {
    public static int calculateTotalOf(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    public static int calculateMinimumOf(int[] numbers) {
        int minimum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            minimum =  Math.min(minimum,numbers[i]);
        }
        return minimum;
    }

    public static int calculateMaximumOf(int[] numbers) {
        int maximum = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            maximum =  Math.max(maximum, numbers[i]);
        }
        return maximum;
    }

    public static double calculateAverageOf(int[] numbers) {
        int sum = 0;
        double average = 0;
        int i;
        for (i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        for (i = 0; i < numbers.length; i++) {
            average = (double) (sum / numbers[i]);
        }
        return average;
    }

    public static int calculateMaximumLessThanOne(int [] numbers){
        int maximumLessOne = calculateTotalOf(numbers) - calculateMinimumOf(numbers);
        return maximumLessOne;
    }

   public static int  calculateMinimumLessThanOne(int [] numbers){
       int minimumLessOne = calculateTotalOf(numbers) - calculateMaximumOf(numbers);
       return minimumLessOne;
   }
   }
