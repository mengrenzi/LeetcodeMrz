#include <cstdio>
#include <iostream>

using namespace std;

void quickSort(int a[], int left, int right){
    int i, j, t, pivot, temp;
    if(i < j){
        i = left, j = right;
        pivot = a[left];
        while(i < j){
            while(a[j] >= pivot && j > i){ j--;}
            while(a[i] <= pivot && j > i){ i++;}

            if(i < j){
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        a[left] = a[i];
        a[i] = pivot;
        quickSort(a, left, i-1);
        quickSort(a, i+1, right);
    }
}


int main(){
    int a[5], len = 5;
    for(int i = 0; i< len; i++){
        a[i] = 5 - i;
    }

    quickSort(a,0,4);
    for(auto i : a){
        cout << i << endl;
    }
    return 0;
}
