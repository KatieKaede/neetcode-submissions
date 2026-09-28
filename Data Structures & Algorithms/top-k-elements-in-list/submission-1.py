class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        result = []
        frequency_dict = {}

        for i in range(len(nums)):
            if nums[i] not in frequency_dict:
                frequency_dict[nums[i]] = 1
            else:
                frequency_dict[nums[i]] = frequency_dict.get(nums[i]) + 1

        for j in range(k):
            max = 0
            maxKey = 0
            for key in frequency_dict:
                if frequency_dict.get(key) > max:
                    max = frequency_dict.get(key)
                    maxKey = key
                
            result.append(maxKey)
            frequency_dict.pop(maxKey)

        return result

        
        