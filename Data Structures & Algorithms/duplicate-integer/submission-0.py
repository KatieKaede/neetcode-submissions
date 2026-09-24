class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        seen = set()
        repeats = False

        for i in range(len(nums)):
            if nums[i] in seen:
                repeats = True
            else: 
                seen.add(nums[i])

        print(seen)
        return repeats
        