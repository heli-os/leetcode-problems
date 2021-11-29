from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

head = ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5)))))

tc.assertEqual(
    first=str(sol.oddEvenList(head=head)),
    second=str(ListNode(1, ListNode(3, ListNode(5, ListNode(2, ListNode(4)))))),
    msg='Not Equal => Except value and Actual value'
)

head = ListNode(2, ListNode(1, ListNode(3, ListNode(5, ListNode(6, ListNode(4, ListNode(7)))))))

tc.assertEqual(
    first=str(sol.oddEvenList(head=head)),
    second=str(ListNode(2, ListNode(3, ListNode(6, ListNode(7, ListNode(1, ListNode(5, ListNode(4)))))))),
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
