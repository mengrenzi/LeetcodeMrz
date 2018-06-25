#include <cstdio>
#include <map>
#include <iostream>
#include <vector>
#include <set>
#include <cstring>
#include <algorithm>

using namespace std;

class Solution {
public:
    bool isIsomorphic(string s, string t) {
        if(s.length() != t.length()) return false;
        map<char, int> ms;
        map<char, int> mt;
        for(int i = 0; i< s.length(); i++){
            if(ms[s[i]] != mt[t[i]]) return false;
            ms[s[i]] = mt[t[i]] = i + 1;
        }
        return true;
    }
};


int main(){
    Solution solution;
    cout << solution.isIsomorphic("ab","aa");
    return 0;
}
