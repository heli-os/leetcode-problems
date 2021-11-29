from Solution import Solution
from unittest import TestCase

sol = Solution()
tc = TestCase()

tc.assertEqual(
    first=sol.threeSum([-1, 0, 1, 2, -1, -4]),
    second=[[-1, -1, 2], [-1, 0, 1]],
    msg='Not Equal => Except value and Actual value'
)

tc.assertEqual(
    first=sol.threeSum([]),
    second=[],
    msg='Not Equal => Except value and Actual value'
)

tc.assertEqual(
    first=sol.threeSum([0]),
    second=[],
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')