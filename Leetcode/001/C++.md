#include <iostream>
#include <vector>
using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        int lens = nums.size();
        vector<int> res;
        for(int i = 0; i< lens; i++){
            for(int j = i+1; j< lens; j++){
                if(nums[i] + nums[j] == target)
                {
                    res.push_back(i);
                    res.push_back(j);
                    return res;
                }

            }
        }
    }
};

int main()
{
    Solution sol;
    vector<int> nums, res;
    nums.push_back(2);
    nums.push_back(7);
    nums.push_back(11);
    nums.push_back(5);
    res = sol.twoSum(nums, 9);
    for (int i = 0; i < res.size(); i++) {
        cout << res[i] << " ";
    }
    return 0;
}
