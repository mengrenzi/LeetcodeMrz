#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
    void sortColors(vector<int>& nums) {
        for(int i = 0, zero = 0, one = 0; i< nums.size(); i++){
            if(nums[i] == 0){ swap(nums[zero],nums[i]); zero++; one = max(zero,one); }
            if(nums[i] == 1){ swap(nums[one],nums[i]); one++; }
        }
    }
};

int main(){
    int num[] ={2,1,2,0,1,1,1,1};
    vector<int> a(num,num+8);
    Solution solution;
    solution.sortColors(a);
}
