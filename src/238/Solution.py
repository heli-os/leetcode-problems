from typing import *


class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        p = 1
        ret = []
        for i in range(len(nums)):
            ret.append(p)
            p = p * nums[i]

        p = 1
        for i in range(len(nums) - 1, -1, -1):
            ret[i] = ret[i] * p
            p = p * nums[i]
        return ret
