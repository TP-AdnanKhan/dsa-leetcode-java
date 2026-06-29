class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        if(arr.length==2)
        return true;
        int i,j;
        for(i=0;i<arr.length-1;i++){
            for(j=0;j<arr.length-i-1;j++){
                if(arr[j+1]<arr[j]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        int diff=arr[1]-arr[0];
        for(i=0;i<arr.length-1;i++){
            if(arr[i+1]-arr[i]!=diff)
            return false;
        }
        return true;
    }
}
