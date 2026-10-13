class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:
        output = []

        # prefix array
        left = 1
        for num in nums:
            # make index the correct prefix number
            output.append(left)
            # update left when we move forward to have the current index ready to be in the product of the next
            left *= num

        right = 1
        # start index, stop index, increment
        for i in range(len(nums) - 1, -1, -1):
            output[i] *= right
            right *= nums[i]

        return output
        