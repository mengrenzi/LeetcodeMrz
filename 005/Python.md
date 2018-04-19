class Solution(object):
    def __init__(self):
        self.longSize = 0
        self.longStart = 0

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        for value, key in enumerate(s):
            Solution.checkOddPalindromic(self,s,value)
            Solution.checkEvenPalindromic(self,s,value)
        return s[self.longStart:self.longStart + self.longSize]

    def checkOddPalindromic(self,s,index):
        start = index
        end = index
        while start >= 1 and end < len(s) - 1 and s[start - 1] == s[end + 1]:
            start = start - 1
            end = end + 1
        if end - start + 1 > self.longSize:
            self.longSize = end - start + 1
            self.longStart = start

    def checkEvenPalindromic(self,s,index):
        start = index
        end = index + 1
        while start >= 1 and end < len(s) - 1 and s[start - 1] == s[end + 1] and s[start] == s[end]:
            start = start - 1
            end = end + 1
        if end - start + 1 > self.longSize and end <= len(s) - 1 and s[start] == s[end]:
            self.longSize = end - start + 1
            self.longStart = start
