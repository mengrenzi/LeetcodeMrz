#include <cstdio>
#include <iostream>
#include <vector>
#include <algorithm>

#define maxn 15

using namespace std;


vector<int> nums, ans;
int n, x;

bool comp(int a, int b){
    return a < b;
}

void traversalNum(int deep, int flag[], vector<int> ans){
    if(deep == n){
        for(auto i : ans){
            cout << i;
        }
        cout << endl;
        return;
    }

    for(int i = 0; i< n; i++){
        if(flag[i] == 0){
            flag[i] = 1;
            ans.push_back(nums[i]);
            traversalNum(deep+1, flag, ans);
            ans.pop_back();
            flag[i] = 0;
        }
    }
}


int main(){
    int flag[maxn] = {0};
    cin >> n;
    for(int i = 0; i< n; i++){
        cin >> x;
        nums.push_back(x);
    }
    sort(nums.begin(),nums.end(), comp);
    traversalNum(0, flag, ans);

    return 0;
}
