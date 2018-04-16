#include <iostream>
#include <vector>
using namespace std;

#define MAX_INT 2147483647
#define MIN_INT (- MAX_INT - 1)

class Solution {
public:
    int reverse(int x) {
        int res = 0;
        while(x != 0){
            if (res > MAX_INT / 10 || res < MIN_INT / 10){
                return 0;
            }
            res = (x % 10) + res * 10;
            x = x /10;
        }
        return res;
    }
};

int main()
{
    Solution sol;
    int res = sol.reverse(-1234);
    cout << res;
    return 0;
}
