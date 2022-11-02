class Solution:
    def generateParenthesis(self, n: int) -> List[str]:
        
        res = []
        string = "" 
        op, cl = 0,0
        
        def backtrack(op, cl, string):
            
            if(op==cl == n):
                res.append(string)
                return
                
            if(op<n):
                string1= string+'('
                backtrack(op+1,cl, string1)
            if(cl<op):
                string2= string+')'
                backtrack(op,cl+1, string2)
        backtrack(0,0,string)
        return res
            
            
                
            
            
            
        