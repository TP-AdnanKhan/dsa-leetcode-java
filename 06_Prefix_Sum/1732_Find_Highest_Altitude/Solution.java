class Solution {
    public int largestAltitude(int[] gain) {
        int n=0;int max=0;
        for(int i=0;i<gain.length;i++){
            n+=gain[i];
            if(max<n)
            max=n;
        }
        return max;
    }
}
