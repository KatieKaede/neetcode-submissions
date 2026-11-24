class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        appeared = []
        
        for num in nums:
            if num not in appeared:
                appeared.append(num)

            else:
                return True
                
        return False

        