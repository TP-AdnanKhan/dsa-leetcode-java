class Solution {
    public boolean isPalindrome(int x) {
        int sum=0,x1=x;
        if(x<0) return false;
        while(x1!=0){
            sum=(sum*10)+(x1%10);
            x1=x1/10;
        }
        if(sum==x) return true;
        else return false;
    }
}
