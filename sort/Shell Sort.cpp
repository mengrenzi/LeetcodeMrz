#include <cstdio>
#include <iostream>

using namespace std;

void shell_sort (int arr[], int n) {
    for (int h = n / 2; h > 0; h /= 2) {
        for (int i = h; i < n; i++) {
            int temp = arr[i];
            for (int j = i - h; j >= 0 && arr[j] > temp; j -= h) {
                arr[j + h] = arr[j];
            }
            arr[j + h] = temp;
        }
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
