class Solution {
    public int [] sortArray(int[] nums) {
      int[] right=new int[nums.length/2];
      int [] left=new int [nums.length-right.length];

      if(nums.length==1){
        return nums;
      }
      for(int i=0;i<left.length;i++){
        left[i]=nums[i];
      }
      for(int i=0;i<right.length;i++){
        right[i]=nums[left.length+i];
      }
      sortArray(left);
      sortArray(right);
      merge(left,right,nums);
      return nums;
    }
    public void merge(int []arr1,int [] arr2,int [] res){
        int p1=0;
		int p2=0;
		int p3=0;
		while(p1<arr1.length && p2<arr2.length) {
			if(arr1[p1]<arr2[p2]) {
				res[p3]=arr1[p1];
				p3++;  p1++;
			}
			else {
				res[p3]=arr2[p2];
				p3++;  p2++;
			}
		}
		while(p1<arr1.length) {
			res[p3]=arr1[p1];
			p3++;  p1++;
		}
		while(p2<arr2.length) {
			res[p3]=arr2[p2];
			p3++;  p2++;
		}
    }
}