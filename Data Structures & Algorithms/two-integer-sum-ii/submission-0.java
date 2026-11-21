class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n=numbers.length;
        int i=0;
        int j=n-1;
        while(j>i){
            if(numbers[i]+numbers[j]==target){
                return new int[]{i+1,j+1};
            }
            if(numbers[i]+numbers[j]>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{1,2};
    }
}
