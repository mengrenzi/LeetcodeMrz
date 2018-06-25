// 在长度为n的母串中匹配长度为m的子串

#include <cstdio>
#include <iostream>
#include <cstring>

#define maxn 100 + 5

using namespace std;

char *cmpChar(const char* n,const char* m){
    if(!*m) return (char*)n;
    if(!*n) return NULL;
    char *p1 = (char*)n;
    while(*p1){
        char *p2 = (char*)m, *p1Begin = (char*)p1;
        while(*p2 == *p1 && *p1 && *p2){
             p1++;
             p2++;
        }
        if(!*p2)
            return p1Begin;
        p1 = p1Begin + 1;
    }
    return NULL;
}

int main(){
    char s1[maxn], s2[maxn];
    cin >> s1 >> s2;

    if(cmpChar(s1,s2)){
        cout << cmpChar(s1,s2) << endl;
    }
    return 0;
}
