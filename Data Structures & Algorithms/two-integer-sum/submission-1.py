class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        numbers_dict = {}

        for i, num in enumerate(nums):
            complement = target - num

            if complement in numbers_dict:
                return [numbers_dict[complement], i]

            numbers_dict[num] = i
        