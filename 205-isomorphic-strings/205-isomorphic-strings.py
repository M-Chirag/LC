class Solution:
    def isIsomorphic(self, s: str, t: str) -> bool:
        stMap = {}
        tsMap = {}
        for e1,e2 in zip(s,t):
            if((e1 in stMap and stMap[e1]!=e2)
              or (e2 in tsMap and tsMap[e2]!=e1)):
                return False
            stMap[e1] = e2
            tsMap[e2] = e1
        
        return True
            
                
            