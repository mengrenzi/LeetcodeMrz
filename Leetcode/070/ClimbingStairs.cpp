#include <cstdio>
#include <iostream>
#include <vector>
using namespace std;

int climbingStairs(int n){
    vector<int> x(n,-1);
    x[0] = 1, x[1] = 2;
    for(int i = 2; i< n; i++){
        x[i] = x[i-1] + x[i-2];
    }
    return x[n-1];
}

int main(){
    cout << climbingStairs(10);
    return 0;
}
