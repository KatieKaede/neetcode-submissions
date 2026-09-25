class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        anagram_groups = {}

        for word in range(len(strs)):
            new_list = list(strs[word])
            sorted_list = sorted(new_list)
            result = "".join(sorted_list)

            if result not in anagram_groups:
                anagram_groups[result] = []

            anagram_groups[result].append(strs[word])

        final_list = list(anagram_groups.values())

        return final_list
        