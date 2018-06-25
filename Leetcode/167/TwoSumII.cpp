#include <cstdio>
#include <vector>
#include <algorithm>
#include <iostream>

using namespace std;

class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
        vector<int> ans;
        int low, high, mid;
        for(int i = 0; i< numbers.size(); i++){
            low = i + 1;
            high = numbers.size() - 1;
            mid = (low + high + 1) /2;
            while(low <= high){
                if(numbers[mid] == target - numbers[i]){
                    ans.push_back(++i);
                    ans.push_back(++mid);
                    return ans;
                }
                else if(numbers[mid] > target - numbers[i]){
                    high = mid - 1;
                    mid = (low + high + 1) /2;
                }
                else{
                    low = mid + 1;
                    mid = (low + high + 1) /2;
                }
            }
        }
        return ans;
    }
};

int main(){
    int num[] ={-1,0};
    vector<int> a(num,num+2);
    Solution solution;
    solution.twoSum(a,-1);
}
