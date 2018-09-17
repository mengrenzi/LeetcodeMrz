#include <cstdio>
#include <iostream>
#include <vector>
#include <cstring>

using namespace std;

int main(){
    vector<char> ans, tmp;
    string ss, str;
    int max = 0;

    while(cin >> str){
        for(int i = 0; i< str.size(); i++){
            for(;i< str.size() && str[i] >= '0' && str[i] <= '9';i++){
                tmp.push_back(str[i]);
            }
            if(tmp.size() > max){
                ans.clear();
                ans = tmp;
                max = ans.size();
            }
            else if(tmp.size() == ans.size()){
                ans.insert(ans.end(), tmp.begin(), tmp.end());
            }
            tmp.clear();
        }

        for(auto i: ans){
            cout << i;
        }
        cout << ','<<max<<endl;
    }
    return 0;
}
