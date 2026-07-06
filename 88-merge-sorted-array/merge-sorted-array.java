class Solution {
    public void merge(int[] num1, int m, int[] num2, int n) {
            int p1=0;
            int p2=0;
            int p3=0;
            int [] arr= new int[num1.length];
            while(p1<m && p2<n){
                if(num1[p1]<num2[p2]){
                    arr[p3]=num1[p1];
                    p1++;
                    p3++;
                }else{
                    arr[p3]=num2[p2];
                    p3++;
                    p2++;
                }
            }
            while(p1<m){
                arr[p3]=num1[p1];
                p3++; p1++;
            }
            while(p2<n){
                arr[p3]=num2[p2];
                p2++; p3++;
            }
            for(int i=0;i<num1.length;i++){
                num1[i]=arr[i];
            }
        }  
    }
