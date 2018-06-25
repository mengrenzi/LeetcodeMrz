#include <cstdio>
#include <iostream>

using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(NULL) {}
};

class Solution {
public:
    ListNode* reverseBetween(ListNode* head, int m, int n) {
        ListNode* pre = NULL;
        ListNode* cur = head;

        int count = 0;
        while(!cur && count <= n){
            ListNode* next = cur -> next;
            ListNode* nnext = NULL;
            ListNode* mpre = pre;
            count ++;
            if(count == m){
                cur -> next = nnext;
                cur = pre -> next -> next;
            }
            if(count > m && count < n){
                cur -> next = pre;
            }
            if(count == n){
                nnext = cur -> next;
                cur -> next = pre;
                mpre -> next = cur;
            }
            pre = cur;
            cur = next;
        }
        return head;
    }
};

int main(){


Solution
