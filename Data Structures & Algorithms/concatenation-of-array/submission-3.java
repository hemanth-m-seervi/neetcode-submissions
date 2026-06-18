class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] a = new int[nums.length*2];
        int j=0;
        for(int i =0;i<2;i++){
            for(int k=0;k<nums.length;k++){
                a[j]=nums[k];
                j++;
            }
        }
        return a;
    }
}