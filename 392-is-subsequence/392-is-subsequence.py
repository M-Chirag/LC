class Solution:
    def isSubsequence(self, s: str, t: str) -> bool:
        indexS = 0
        indexT = 0 
        if len(s)==0: return True
        if len(t)==0: return False
        for i in range(len(t)):
            if(s[indexS]==t[i]):
                indexS+=1
            if(indexS == len(s)): return True
        return False
        