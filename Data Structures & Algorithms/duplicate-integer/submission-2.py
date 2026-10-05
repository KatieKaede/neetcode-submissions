class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen_dict = {}

        for idx in range(len(nums)):
            if nums[idx] not in seen_dict:
                seen_dict[nums[idx]] = 1
            else:
                return True
                
        return False
        