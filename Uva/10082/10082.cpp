#include<cstdio>

char set[] = {"`1234567890-=QWERTYUIOP[]\ASDFGHJKL;'ZXCVBNM,./"};

int main(){
    char c;
    int i;
    while((c = getchar()) != EOF){
        for(i = 0; set[i] != c && set[i] ;i++);
        if(set[i]) printf("%c", set[i-1]);
        else printf("%c", c);
    }
    return 0;
}
