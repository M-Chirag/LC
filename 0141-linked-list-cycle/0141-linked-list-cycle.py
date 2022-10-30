# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        slow = head
        fast = head
        
        if(head and head.next):
            fast = fast.next
        else:
            return False

        while(slow!=fast):
            if(fast.next==None or fast.next.next==None):
                return False
            slow = slow.next
            fast = fast.next.next
        else:
            return True
        return False
       