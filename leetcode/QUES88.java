package leetcode;

public class QUES88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] arr = new int[m+n];
        for(int i=0;i<m;i++){
            arr[i] = nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[m+i] = nums2[i];
        }
        
        for(int i=0;i<m+n-1;i++){
            for(int j=0;j<m+n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        for(int i=0;i<m+n;i++){
            nums1[i] = arr[i];
        }
}
