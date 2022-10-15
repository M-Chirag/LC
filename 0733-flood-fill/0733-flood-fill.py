class Solution:
    def floodFill(self, image: List[List[int]], sr: int, sc: int, color: int) -> List[List[int]]:
        rLen = len(image)
        cLen = len(image[0])
        
        old_color = image[sr][sc]
        
        def dfs(sr, sc, image, old_color, new_color):
            
            if(sr<0 or sr>=rLen or sc<0 or sc>=cLen or image[sr][sc]==new_color or image[sr][sc]!=old_color):
                return
            
            image[sr][sc] = new_color
            dfs(sr+1, sc, image, old_color, new_color)
            dfs(sr-1, sc, image, old_color, new_color)
            dfs(sr, sc+1, image, old_color, new_color)
            dfs(sr, sc-1, image, old_color, new_color)
        
        dfs(sr,sc,image,old_color, color)
        return image