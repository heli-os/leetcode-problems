from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

head = ListNode(1, ListNode(2, ListNode(3, ListNode(4))))

tc.assertEqual(
    first=str(sol.swapPairs(head=head)),
    second=str(ListNode(2, ListNode(1, ListNode(4, ListNode(3))))),
    msg='Not Equal => Except value and Actual value'
)

head = ListNode()

tc.assertEqual(
    first=str(sol.swapPairs(head=head)),
    second=str(ListNode()),
    msg='Not Equal => Except value and Actual value'
)

head = ListNode(1)

tc.assertEqual(
    first=str(sol.swapPairs(head=head)),
    second=str(ListNode(1)),
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
