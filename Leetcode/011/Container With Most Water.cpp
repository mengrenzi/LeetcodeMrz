#include <vector>
#include <cstdio>
#include <iostream>
#include<algorithm>

using namespace std;

class Solution {
public:
    int maxArea(vector<int>& height) {
        int maxNumber = 0, maxtmpNumber = 0;
        int start = 0, end = height.size() - 1;

        while(start < end){
            maxtmpNumber = (end - start) * min(height[start], height[end]);
            maxNumber = max(maxtmpNumber, maxNumber);
            height[start] < height[end] ? start++ : end--;
        }

        return maxNumber;
    }
};

int main(){
    vector<int> height{5,18,17,6};

    Solution sol;
    cout << sol.maxArea(height);

    return 0;
}
