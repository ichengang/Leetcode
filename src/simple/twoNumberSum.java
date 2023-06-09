class twoNumberSum {
    public int[] twoSum(int nums[],int target){
        int number = 0;
        int n[] = new int[2];

        for(int i=0;i<nums.length;i++) {
            if(target==nums[number]+nums[i]) {
                n[0] = number;
                n[1] = i;
                break;
            }
            if(i==nums.length-1) {
                i = nums.length + 1;
                number++;
            }
        }
        return n;
    }
}
