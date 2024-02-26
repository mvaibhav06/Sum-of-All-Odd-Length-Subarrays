public class SubArrays {
    public static int summOddSubArrays(int[] nums){
        int i=0;
        int j=0;
        int sum = 0;
        while (i<=j && i<nums.length){
            for (int p=i; p<=j && j<nums.length; p++){
                sum += nums[p];
            }
            j += 2;
            if (j >= nums.length){
                i++;
                j = i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1,2};
        System.out.println(summOddSubArrays(nums));
    }
}
