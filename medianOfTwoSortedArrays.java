class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] answer = new int[nums1.length + nums2.length];
        
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] < nums2[j]){
                answer[k] = nums1[i];
                k++;
                i++;
            } else {
                answer[k] = nums2[j];
                k++;
                j++;
            }
        }
        
        while(i < nums1.length){
            answer[k] = nums1[i];
            k++;
            i++;
        }
        
        while(j < nums2.length){
            answer[k] = nums2[j];
            k++;
            j++;
        }
        
        double median;
        if (answer.length % 2 == 0){
            median = ((double)answer[answer.length/2] + (double)answer[answer.length/2 - 1])/2;
        } else {
            median = (double) answer[answer.length/2];
        }
        return median;
        
}
}
