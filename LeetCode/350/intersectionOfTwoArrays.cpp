#include <cstdio>
#include <iostream>
#include <string>
#include <vector>
#include <map>

using namespace std;

class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {
        map<int,int> flag;
        vector<int> ans;

        for( auto i : nums1){
            flag[i]++;
        }

        for( auto i : nums2){
            if(flag[i] != 0){
                ans.push_back(i);
                flag[i]--;
            }
        }

        return ans;
    }
};



int main(){
    Solution solution;
    intersect(nums);

    return 0;
}

