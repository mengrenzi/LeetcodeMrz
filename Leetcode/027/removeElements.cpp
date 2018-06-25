#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
    int removeElement(vector<int>& nums, int val) {
        int lastNoneVal = 0;

        for(int i = 0; i< nums.size(); i++){
            if(nums[i] != val){
                nums[lastNoneVal++] = nums[i];
            }
        }
        return lastNoneVal;
    }
};
