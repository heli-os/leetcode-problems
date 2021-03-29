from Solution import Solution
from unittest import TestCase

sol = Solution()
tc = TestCase()

tc.assertEqual(
    first=sol.maxProfit(prices=[7, 1, 5, 3, 6, 4]),
    second=5,
    msg='Not Equal => Except value and Actual value'
)

tc.assertEqual(
    first=sol.maxProfit(prices=[7, 6, 4, 3, 1]),
    second=0,
    msg='Not Equal => Except value and Actual value'
)

print('ALL CLEAR')
