#include <cstdio>
#include <iostream>
#include <set>
#include <map>
#include <vector>
#include <algorithm>

using namespace std;

class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {
        set<int> record;
        vector<int> ans;
        for(int j = 0; j< nums1.size(); j++){
            if(find(nums2.begin(),nums2.end(),nums1[j]) != nums2.end()){
                record.insert(nums1[j]);
            }
        }

        for(auto i : record){
            ans.push_back(i);
        }
        return ans;
    }


    vector<int> mapIntersection(vector<int>& nums1, vector<int>& nums2) {
        map<int,int> myMap;

        vector<int> ans;
        for(int i = 0; i< nums1.size(); i++){
            myMap[nums1[i]]++;
        }

        for(int j = 0; j< nums2.size(); j++){
            if(myMap[nums2[j]] != 0){
                ans.push_back(nums2[j]);
                myMap[nums2[j]] = 0;
            }
        }

        return ans;
    }
};

int main(){
    int nums[] = {1,2,2,1};
    Solution solution;
    vector<int> s1(nums, nums+4);
    vector<int> s2(nums+1,nums+3);
//    for(auto i : s2) cout << i <<endl;

    vector<int> s3 = solution.mapIntersection(s1,s2);
    for(auto i : s3) cout << i <<endl;
    return 0;
}
