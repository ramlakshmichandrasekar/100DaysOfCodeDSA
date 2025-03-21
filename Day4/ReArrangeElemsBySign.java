class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] finalArray = new int[n];
        int positiveIndex = 0 , negativeIndex = 1;
        for(int num : nums){
            if(num > 0){
                finalArray[positiveIndex] = num;
                positiveIndex += 2;
            }else{
                finalArray[negativeIndex] = num;
                negativeIndex += 2;
            }
        }
        return finalArray;
    }
}