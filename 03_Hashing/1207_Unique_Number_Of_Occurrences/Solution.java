class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hmap=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int t=arr[i];
            if(hmap.containsKey(t))
                hmap.put(t,hmap.get(t)+1);
            else{
                hmap.put(t,1);
                al.add(t);
            }
        }
        ArrayList <Integer> al2= new ArrayList<>();
        for(int i=0;i<al.size();i++){
            al2.add(hmap.get(al.get(i)));
        }
        Collections.sort(al2);
        for(int i=1;i<al2.size();i++){
            if(al2.get(i).equals(al2.get(i-1)))
            return false;
        }
        return true;
    }
}
