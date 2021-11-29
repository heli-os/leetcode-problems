from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

l1 = ListNode(2,
              ListNode(4,
                       ListNode(3)
                       )
              )

l2 = ListNode(5,
              ListNode(6,
                       ListNode(4)
                       )
              )

tc.assertEqual(
    first=str(sol.addTwoNumbers(l1=l1, l2=l2)),
    second=str(ListNode(7, ListNode(0, ListNode(8)))),
    msg='Not Equal => Except value and Actual value'
)

l1 = ListNode(0)

l2 = ListNode(0)

tc.assertEqual(
    first=str(sol.addTwoNumbers(l1=l1, l2=l2)),
    second=str(ListNode(0)),
    msg='Not Equal => Except value and Actual value'
)

l1 = ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9, ListNode(9)))))))

l2 = ListNode(9, ListNode(9, ListNode(9, ListNode(9))))

tc.assertEqual(
    first=str(sol.addTwoNumbers(l1=l1, l2=l2)),
    second=str(ListNode(8, ListNode(9, ListNode(9, ListNode(9, ListNode(0, ListNode(0, ListNode(0, ListNode(1))))))))),
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
