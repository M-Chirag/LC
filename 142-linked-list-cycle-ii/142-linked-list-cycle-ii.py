# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def detectCycle(self, head: Optional[ListNode]) -> Optional[ListNode]:
        slow = head
        fast = head
        while(fast and fast.next):
            slow = slow.next 
            fast = fast.next.next
            if(fast==slow):
                break
        else:
            return None
        
        index = head
        while(index!=fast):
            index=index.next
            fast=fast.next
        return index
        