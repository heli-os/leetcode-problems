from typing import *
import sys


class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        profit = 0
        min_price = sys.maxsize
        for i in range(len(prices)):
            min_price = min(min_price, prices[i])
            profit = max(profit, prices[i] - min_price)

        return profit
