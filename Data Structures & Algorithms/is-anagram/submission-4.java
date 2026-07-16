class Solution {
    public boolean isAnagram(String s, String t) {
     int lung1=s.length();
     int lung2=t.length();
     if(lung1!=lung2) return false;
     //nu au aceeasi lungime

     Map<Character,Integer> freq1=new HashMap<>();
     Map<Character,Integer> freq2=new HashMap<>();

     for(int i=0;i<lung1;i++)
     {
        //construim frecventa caracterelor fiecarui sir
        char c1=s.charAt(i);
        char c2=t.charAt(i);

        freq1.put(c1,freq1.getOrDefault(c1,0)+1);
        freq2.put(c2,freq2.getOrDefault(c2,0)+1);
     }

     return freq1.equals(freq2);
    }
}
