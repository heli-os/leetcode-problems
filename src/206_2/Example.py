from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

head = ListNode(1,
                ListNode(2)
                )

tc.assertEqual(
    first=str(sol.reverseList(head=head)),
    second=str(ListNode(2, ListNode(1))),
    msg='Not Equal => Except value and Actual value'
)

head = ListNode()

tc.assertEqual(
    first=str(sol.reverseList(head=head)),
    second=str(ListNode()),
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
