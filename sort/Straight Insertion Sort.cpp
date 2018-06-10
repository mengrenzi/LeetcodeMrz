#include <cstdio>
#include <iostream>

using namespace std;

void straightInsertionSort(int a[], int len){
    for(int i = 0; i<len; i++){
        int temp = a[i], j;
        for(j = i - 1; j >= 0 && a[j] > temp; j--){
            a[j+1] = a[j];
        }
        a[j+1] = temp;
    }
}

int main(){
    int a[5], len = 5;
    for(int i = 0; i< len; i++){
        a[i] = 5 - i;
    }

    straightInsertionSort(a, len);
    for(auto i : a){
        cout << i << endl;
    }
    return 0;
}
