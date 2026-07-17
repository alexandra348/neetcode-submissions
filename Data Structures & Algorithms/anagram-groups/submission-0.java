class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        //hashmap ul unde vom stoca frecventele
        HashMap<String,List<String>> res=
           new HashMap<>();
     
       //parcurgem string ul pentru umple hash ul
         for(String s: strs)
         {
            int [] freq=new int[26];

            for(char c : s.toCharArray())
            {
                freq[c-'a']++;
            }

            String key=Arrays.toString(freq);
            res.putIfAbsent(key,new ArrayList<>());
            res.get(key).add(s);
         }

         //returnam lista de liste de Stringuri
         return new ArrayList<>(res.values());


        
    }
}
