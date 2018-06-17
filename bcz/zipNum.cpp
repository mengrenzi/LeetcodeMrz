#include <cstdio>
#include <iostream>
#include <vector>

using namespace std;

int main(){
    vector<int> tmp;
    int n, count = 1, x;
    cin >> n;

    for(int i = 0; i< n; i++){
        cin >> x;
        tmp.push_back(x);
    }

    for(int i = 1; i<= n; i++){
        if(tmp[i]-1 == tmp[i-1]){
            count++;
        }
        else{
            if(count == 1){
                cout << tmp[i-1];
            }
            if(count == 2){
                cout << tmp[i-2] << "," << tmp[i-1];
            }
            if(count >= 3){
                cout << tmp[i-count] << "-" << tmp[i-1];
            }
            count = 1;
            if(i < n)
                cout << ",";
        }

    }


    return 0;
}
