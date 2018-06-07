#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
    int removeDuplicates(vector<int>& nums) {
        if(nums.size() < 2) return nums.size();
        int numsNo = 2;

        for(int i = 2; i< nums.size(); i++){
            cout << i << " nums "<< nums[i] << " nums-2 " << nums[i-2] << endl;

            if(nums[i] != nums[numsNo-2]){
                nums[numsNo++] = nums[i];
            }
        }

        return numsNo;
    }
};

int main(){
    int a[]={1,1,1,2,2,3};
    vector<int> nums(a,a+6);
    Solution solution;
    solution.removeDuplicates(nums);

    return 0;
}
