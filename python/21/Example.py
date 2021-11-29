from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

l1 = ListNode(1,
              ListNode(2,
                       ListNode(4)
                       )
              )

l2 = ListNode(1,
              ListNode(3,
                       ListNode(4)
                       )
              )

tc.assertEqual(
    first=str(sol.mergeTwoLists(l1=l1, l2=l2)),
    second=str(ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4))))))),
    msg='Not Equal => Except value and Actual value'
)

l1 = None

l2 = None

tc.assertEqual(
    first=str(sol.mergeTwoLists(l1=l1, l2=l2)),
    second=str(None),
    msg='Not Equal => Except value and Actual value'
)

l1 = None

l2 = ListNode(0)

tc.assertEqual(
    first=str(sol.mergeTwoLists(l1=l1, l2=l2)),
    second=str(ListNode(0)),
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
