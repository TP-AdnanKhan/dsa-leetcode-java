class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap <Character,Integer> M=new HashMap<>();
        for(int i=0;i<magazine.length();i++){
            char m=magazine.charAt(i);
            if(M.containsKey(m))
                M.put(m,M.get(m)+1);
            else
                M.put(m,1);
        }
        for(int i=0;i<ransomNote.length();i++){
            char rn=ransomNote.charAt(i);
            if(M.containsKey(rn)){
                if(M.get(rn)>0)
                    M.put(rn,M.get(rn)-1);
                else
                    return false;
            }
            else
                return false;
        }
        return true;
    }
}
