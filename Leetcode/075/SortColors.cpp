#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;


class Solution {
public:
    void sortColors(vector<int>& nums) {
        for(int i = 0, j = 0, k = 0, val = 0; i< nums.size(); i++){
            val = nums[i];
            nums[i] = 2;
            if(val < 2){  nums[j] = 1; j++; }
            if(val == 0){ nums[k] = 1; k++; }
        }
    }
};
