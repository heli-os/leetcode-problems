from typing import *
import collections


# Definition for singly-linked list.
class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

    def __str__(self):
        return f'{self.val}->{str(self.next)}'


class Solution:
    def swapPairs(self, head: ListNode) -> ListNode:
        root = prev = ListNode()
        prev.next = head

        while head and head.next:
            n = head.next
            head.next = n.next
            n.next = head

            prev.next = n

            head = head.next
            prev = prev.next.next

        return root.next
