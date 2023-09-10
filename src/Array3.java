public class Array3 {
    public static void main(String[] args) {
        int[] nums = {10, 8, 6, 78};
        int sum = 0;

        for (int i = 0; i < nums.length; i++)
        {
//            For sorting:
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;

                }
            }

// Finding sum:
            sum = sum + nums[i];
        }

        System.out.println("The sum of integers is: " + sum);

// Finding Max and Min values:
        int max = nums[0];
        int min = nums[0];
        for (int a = 1; a < nums.length; a++) {

            if (nums[a] > max) {
                max = nums[a];
            }
            if (nums[a] < min) {
                min = nums[a];
            }
        }
        System.out.println("Maximum value is: " + max);
        System.out.println("Minimum value is:" + min);

// Printing sorted version:
        System.out.println ("Sorted version:");
        for (int i = 0; i < nums.length; i++)
            System.out.println(nums[i]);}

}

