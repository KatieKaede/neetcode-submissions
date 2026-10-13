class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []

        left = 1
        for num in nums:
            output.append(left)
            left *= num

        right = 1
        for i in range(len(nums) - 1, -1, -1):
            output[i] *= right
            right *= nums[i]


        return output
        