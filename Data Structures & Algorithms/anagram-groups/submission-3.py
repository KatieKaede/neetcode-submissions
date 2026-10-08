class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        sorted_dict = {}
        grouped_anagrams = []

        for word in strs:
            word_key = str(sorted(word))

            if word_key in sorted_dict:
                sorted_dict.get(word_key).append(word)
            else:
                sorted_dict[word_key] = [word]

        for key in sorted_dict:
            grouped_anagrams.append(sorted_dict.get(key))

        return grouped_anagrams