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
        if head and head.next:
            p = head.next

            # 스왑된 값 리턴 받음
            head.next = self.swapPairs(p.next)
            p.next = head
            return p
        return head
