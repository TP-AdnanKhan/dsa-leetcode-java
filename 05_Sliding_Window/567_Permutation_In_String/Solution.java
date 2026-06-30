class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int s1l=s1.length();
        int s2l=s2.length();
        
        if(s1l>s2l) return false;

        HashMap <Character,Integer> map1=new HashMap<>();
        HashMap <Character,Integer> map2=new HashMap<>();
        
        for(int i=0;i<s1l;i++){
            char s=s1.charAt(i);
            if(map1.containsKey(s))  map1.put(s,map1.get(s)+1);
            else  map1.put(s,1);
        }
        for(int i=0;i<s1l;i++){
            char s=s2.charAt(i);
            if(map2.containsKey(s))  map2.put(s,map2.get(s)+1);
            else  map2.put(s,1);
        }

        if(map1.equals(map2)) return true;

        for(int i=s1l;i<s2l;i++){
            char s=s2.charAt(i);
            if(map2.containsKey(s))  map2.put(s,map2.get(s)+1);
            else  map2.put(s,1);

            char sl=s2.charAt(i-s1l);
            map2.put(sl,map2.get(sl)-1);
            if(map2.get(sl)==0) map2.remove(sl);

            if(map1.equals(map2)) return true;
        }
        return false;
    }
}
