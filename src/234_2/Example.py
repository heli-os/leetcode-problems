from Solution import Solution
from Solution import ListNode
from unittest import TestCase

sol = Solution()
tc = TestCase()

head = ListNode(1,
                ListNode(2,
                         ListNode(2,
                                  ListNode(1)
                                  )
                         )
                )

tc.assertEqual(
    first=sol.isPalindrome(head=head),
    second=True,
    msg='Not Equal => Except value and Actual value'
)

head = ListNode(1,
                ListNode(2)
                )

tc.assertEqual(
    first=sol.isPalindrome(head=head),
    second=False,
    msg='Not Equal => Except value and Actual value'
)

head = ListNode(1,
                ListNode(2,
                         ListNode(1)
                         )
                )

tc.assertEqual(
    first=sol.isPalindrome(head=head),
    second=True,
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
