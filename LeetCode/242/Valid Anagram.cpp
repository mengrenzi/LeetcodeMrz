#include <cstdio>
#include <map>
#include <iostream>
#include <vector>
#include <set>
#include <cstring>
#include <algorithm>

using namespace std;

class Solution {
public:
    bool isHappy(int n) {
        vector<int> count;

        while(n != 1){
            if(find(count.begin(),count.end(),n) != count.end()){
                return false;
            }
            else{
                count.push_back(n);
            }

            int tmp = n, x;
            n = 0;
            while(tmp){
                x = tmp % 10;
                tmp = tmp /10;
                n = x * x + n;
            }
        }
        return true;
    }
};

int main(){
    Solution solution;
    if(solution.isHappy(19)) cout << "true";
    else cout << "false";
    return 0;
}

