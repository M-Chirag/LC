# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        current = head
        previous = None
        
        while(current is not None):
            nex = current.next
            current.next = previous
            previous = current
            current = nex
            
        return previous
            
            