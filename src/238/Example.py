from Solution import Solution
from unittest import TestCase

sol = Solution()
tc = TestCase()

tc.assertEqual(
    first=sol.productExceptSelf(nums=[1, 2, 3, 4]),
    second=[24, 12, 8, 6],
    msg='Not Equal => Except value and Actual value'
)

tc.assertEqual(
    first=sol.productExceptSelf(nums=[-1, 1, 0, -3, 3]),
    second=[0, 0, 9, 0, 0],
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
