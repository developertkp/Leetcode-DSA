class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        int xors=0;
        for(int num : nums){
            xor ^= num;
        }
        int p = nums.length;
        for(int i=0;i <= p; i++){
            xors ^=i;
        }
        int result = xor ^ xors;
        return result;
    }
}