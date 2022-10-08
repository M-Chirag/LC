class Solution:
    def longestPalindrome(self, s: str) -> int:
        hm = {}
        for c in s:
            if (c in hm):
                hm[c]+=1
            else:
                hm[c] =1
        length = 0
        odd_count,sin = 0,0
        for key,element in hm.items():
            if(element%2 ==0):
                length += element
            if(element%2!=0 and element>1):
                odd_count +=1
                length += element-1
            if element==1:
                sin+=1
        if sin or odd_count:
            length+=1
                
        return length
        