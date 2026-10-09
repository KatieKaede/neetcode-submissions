class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        result = []
        seen_dict = {}

        for num in nums:
            if num not in seen_dict:
                seen_dict[num] = 1
            else:
                seen_dict[num] = seen_dict.get(num) + 1
        
        for i in range(k):
            max_key = max(seen_dict, key=seen_dict.get)
            result.append(max_key)
            seen_dict.pop(max_key)

        return result
        