#include <cstdio>
#include <vector>
#include <iostream>

using namespace std;

class Solution {
public:
    void moveZeroes(vector<int>& nums) {


//        解法1
//
//        int numsLength = nums.size();
//
//        int zeroNCount = 0;
//        for(int i = 0; i< numsLength; i++){
//            if(nums[i] != 0){
//                nums[zeroNCount++] = nums[i];
//            }
//        }
//
//        for(int i = zeroNCount; i< numsLength; i++){
//            nums[i] = 0;
//        }
//
        //解法2
        for(int lastNoneZeroFoundAt = 0, cur = 0; cur < nums.size();cur++){
            if(nums[cur] != 0){
                swap(nums[lastNoneZeroFoundAt++],nums[cur]);
            }
        }

        for(auto i:nums){
            cout << i << endl;
        }

    }
};

int main(){

    int a[5] = {0,1,0,3,12};
    vector<int> nums(a, a+5);

    Solution solution;
    solution.moveZeroes(nums);


    return 0;
}
