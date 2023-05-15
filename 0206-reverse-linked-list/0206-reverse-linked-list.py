# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:    
        def reverse(prev,curr):
            if curr==None:
                return prev
            
            nex = curr.next
            curr.next = prev
            return reverse(curr, nex)

        return reverse(None, head)
            
        
            
            