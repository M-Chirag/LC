# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        q = []
        res = []
        q.append(root)
        while q:
            qLen = len(q)
            arr = []
            for i in range(qLen):
                node = q.pop(0)
                if node:
                    arr.append(node.val)
                    q.append(node.left)
                    q.append(node.right)
            if arr:
                res.append(arr)
        return res
            
        