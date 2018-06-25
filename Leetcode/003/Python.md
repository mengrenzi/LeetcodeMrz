class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        tempDict = {}
        maxLen = 0
        pointer = 0
        for index,value in enumerate(s):
            if value in tempDict:
                pointer = max(tempDict[value] + 1, pointer)
            maxLen = max(index-pointer + 1, maxLen)
            tempDict[value] = index
        return maxLen
