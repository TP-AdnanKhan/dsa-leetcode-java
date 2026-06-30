class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap <Integer,Integer> hmap=new HashMap<>();
        for(int i=0;i<nums1.length;i++){
            int n=nums1[i];
            if(hmap.containsKey(n))
                hmap.put(n,hmap.get(n)+1);
            else
                hmap.put(n,1);
        }
        ArrayList <Integer> arr=new ArrayList<>();
        for(int i=0;i<nums2.length;i++){
            int n=nums2[i];
            if(hmap.containsKey(n)){
                if(hmap.get(n)>0){
                    arr.add(n);
                    hmap.put(n,hmap.get(n)-1);
                }
            }
        }
        int ans[]=new int[arr.size()];
        for(int i=0;i<arr.size();i++){
            ans[i]=arr.get(i);
        }
        return ans;
    }
}
