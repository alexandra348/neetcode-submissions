class Solution {
public:
    bool hasDuplicate(vector<int>& nums) {
        unordered_map<int,int> frecventa;
        for (int x: nums)
        {
         frecventa[x]++;
         if (frecventa[x]>1) return true;
        }
        return false;
    }
};