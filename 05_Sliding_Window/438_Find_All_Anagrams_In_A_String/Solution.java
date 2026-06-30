class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int i,plen=p.length(),slen=s.length();
        HashMap <Character,Integer> Pmap=new HashMap<>();
        HashMap <Character,Integer> Smap=new HashMap<>();
        List <Integer> l=new ArrayList<>();

        if(plen>slen) return l;

        for(i=0;i<plen;i++){
            char Pch=p.charAt(i);
            if(Pmap.containsKey(Pch)) Pmap.put(Pch,Pmap.get(Pch)+1);
            else Pmap.put(Pch,1);

            char Sch=s.charAt(i);
            if(Smap.containsKey(Sch)) Smap.put(Sch,Smap.get(Sch)+1);
            else Smap.put(Sch,1);
        }

        if(Pmap.equals(Smap)) l.add(0);

        for(i=plen;i<slen;i++){
            char Sch=s.charAt(i);
            if(Smap.containsKey(Sch)) Smap.put(Sch,Smap.get(Sch)+1);
            else Smap.put(Sch,1);

            char leftSch=s.charAt(i-plen);
            Smap.put(leftSch,Smap.get(leftSch)-1);
            if(Smap.get(leftSch)<=0) Smap.remove(leftSch);

            if(Pmap.equals(Smap)) l.add(i-plen+1);
        }
        return l;
    }
}
