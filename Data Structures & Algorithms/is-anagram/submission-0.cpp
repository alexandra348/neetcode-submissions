class Solution {
public:
    bool isAnagram(string s, string t) {
        if(s.length()!=t.length()) return false;
        
        map <char,int> frec_s;
        map <char,int> frec_t;
        
        for(int i=0;i<s.length();i++)
        {
            frec_s[s[i]]++;
            frec_t[t[i]]++;
        }

        //comparam frecventele
        return frec_s==frec_t;

    }
};
