#include <cstdio>
#include <iostream>

using namespace std;

void bubbleSort(int a[], int len){
    for(int i = 0; i< len; i++){
        for(int k = 0; k< len - 1 - i; k++){
            if(a[k-1] < a[k]){
                int temp = a[k];
                a[k] = a[k+1];
                a[k+1] = temp;
            }
        }
    }

}

int main(){
    int a[5], len = 5;
    for(int i = 0; i< len; i++){
        a[i] = 5 - i;
    }

    bubbleSort(a, len);
    for(auto i : a){
        cout << i << endl;
    }
    return 0;
}
