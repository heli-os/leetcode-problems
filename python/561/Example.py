from Solution import Solution
from unittest import TestCase

sol = Solution()
tc = TestCase()

tc.assertEqual(
    first=sol.arrayPairSum(nums=[1, 4, 3, 2]),
    second=4,
    msg='Not Equal => Except value and Actual value'
)

tc.assertEqual(
    first=sol.arrayPairSum(nums=[6, 2, 6, 5, 1, 2]),
    second=9,
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
