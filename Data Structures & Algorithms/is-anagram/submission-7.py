class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
    
        if len(s) != len(t):
            return False

        seen = {}

        for char in s:
            if char not in seen:
                seen[char] = 1
            else:
                seen[char] = seen.get(char) + 1

        for char in t:
            if char in seen:
                if seen.get(char) > 0:
                    seen[char] = seen.get(char) - 1
                else:
                    return False
            else:
                return False

        return True