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
    def reverseList(self, head: ListNode) -> ListNode:
        def reverse(node: ListNode, prev: ListNode = None):
            if not node:
                print(node, prev)
                return prev
            next_item, node.next = node.next, prev
            return reverse(next_item, node)

        return reverse(head)
