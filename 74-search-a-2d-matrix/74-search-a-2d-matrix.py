class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        #Converting 2D array to 1D array
#         l = 0
#         r = len(matrix) * len(matrix[0]) -1
#         while(l<=r):
#             mid = r-(r-l)//2

#             r_index = mid//len(matrix[0])
#             c_index = mid%len(matrix[0])
            
#             if(matrix[r_index][c_index]==target):
#                 return True
            
#             if(matrix[r_index][c_index]<target):
#                 l = mid + 1
#             else:
#                 r = mid-1
        
        
        row = 0
        col = len(matrix[0]) - 1
        while (row < len(matrix) and col >= 0):
            if (matrix[row][col] == target):
                return True

            # Target lies in further row
            if (matrix[row][col] < target):
                row += 1

            # Target lies in previous column
            else:
                col -= 1



        return False
    
        