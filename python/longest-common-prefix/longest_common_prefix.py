from pip import List


class LongestCommonPrefix:
    def longestCommonPrefix(self, strs: List[str]) -> str:
        if len(strs) == 0:
            return ""
        if len(strs) == 1:
            return strs[0]

        shortest = min(strs, key=len)
        for i, ch in enumerate(shortest):
            for string in strs:
                if string[i] != ch:
                    return string[0:i]
        return shortest
