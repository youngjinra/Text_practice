package yalco.sec04.chap05;

public class Ex04 {

    static double getAverage(int[] nums){
        double sum = 0;
        for (int num : nums){
            sum += num;
        }

        return sum/ nums.length;
    }

    static int[] getMaxAndMin(int[] nums){

        int max = nums[0];
        int min = nums[0];
        for (int num : nums){
            max = max > num ? max : num;
            min = min < num ? min : num;
        }

        return new int[] {max, min};

    }
    public static void main(String[] args) {

        double avg = getAverage(new int[] {3, 5, 4, 13, 7});

        System.out.println("\n-----------\n");

        int[] numbers = {3, 5, 9, 2, 8, 1, 4};

        int maxOfNumbers = getMaxAndMin(numbers)[0];
        int minOfNumbers = getMaxAndMin(numbers)[1];
    }
}
