class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        hm = {}

        for word in strs:
            cnt = [0]*26
            for c in word:
                cnt[ord(c)-ord('a')]+=1
            
            q = tuple(cnt)
            if q in hm:
                hm[q].append(word)
            else:
                hm[q]=[word]
        
        return hm.values()

        