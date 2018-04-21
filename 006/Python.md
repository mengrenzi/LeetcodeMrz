class Solution(object):
    def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        myDic = {}
        cycle = numRows * 2 - 2
        row = 0
        res = ""
        tmp = []
        for i in range(0,numRows):
            myDic[i] = []
        for value, key in enumerate(s):
            if cycle == 0:
                row = 0
            elif value % cycle <= numRows - 1:
                row = value % cycle
            else:
                row = cycle - value % cycle
            myDic[row].append(key)

        for i in range(0,numRows):
            res = res + "".join(myDic[i])

        return res
