class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        HashMap<Character,Integer>hmap1=new HashMap<>(); HashMap<Character,Integer>hmap2=new HashMap<>();
        ArrayList <Character> arr=new ArrayList<>();
        
        for(int i=0;i<s.length();i++){
          char sr=s.charAt(i);
          char tr=t.charAt(i);
            if(hmap1.containsKey(sr)){ hmap1.put(sr,hmap1.get(sr)+1); 
            
            }
            else{ hmap1.put(sr,1); 
            arr.add(sr);
            }
     
            
if(hmap2.containsKey(tr)){ hmap2.put(tr,hmap2.get(tr)+1); }
            else{ hmap2.put(tr,1); }
          
           
        }
        
        int count=0;
        for(int i=0;i<arr.size();i++){
            if(hmap1.get(arr.get(i)).equals(hmap2.get(arr.get(i))))
            count ++;
        }
        if(count==arr.size())
        return true;
        return false;
    }
}
