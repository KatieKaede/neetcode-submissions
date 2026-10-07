class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_dict = {}

        for num in nums:
            if num not in seen_dict:
                seen_dict[num] = 1
            else:
                return True

        return False
        