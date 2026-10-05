class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_numbers = {}
        test = False

        for num in nums:
            if num in seen_numbers:
                return True
            else:
                seen_numbers[num] = 1

        return False
        