#include <cstdio>
#include <iostream>
#include <vector>
#include <algorithm>

#define maxn 105

using namespace std;

int minDistance(string word1, string word2) {
    int len1=word1.length();
    int len2=word2.length();

    vector<vector<int>>dp(len1+1,vector<int>(len2+1));
    for(int i=0;i<=len1;i++){
        for(int j=0;j<=len2;j++){
            if(i==0){
                dp[i][j]=j;   //如果 i=0 则需要插入j个字符
            }else if(j==0){
                dp[i][j]=i;    //如果j=0则需要删除i个字符
            }else if(word1[i-1]==word2[j-1]){   //如果字符相同则不做变换，等于这个字符之前的步数
                dp[i][j]=dp[i-1][j-1];
            }else{                          //否则 就从插入，删除，修改中选择最小的 加 1
                dp[i][j]=min(min(dp[i-1][j],dp[i][j-1]),dp[i-1][j-1])+1;
            }
        }
    }
    return dp[len1][len2];
}


int main(){
    string s1,s2,n;
    while(n--){
        cin >> s1 >> s2;
        cout << minDistance(s1,s2);
    }
    return 0;
}
