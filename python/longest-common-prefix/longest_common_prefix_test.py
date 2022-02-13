import unittest

from longest_common_prefix import LongestCommonPrefix


class MyTest(unittest.TestCase):
    def test(self):
        self.assertEqual(LongestCommonPrefix().longestCommonPrefix(
            ["flower", "flow", "flight"]), "fl")
        self.assertEqual(LongestCommonPrefix().longestCommonPrefix(
            ["dog", "racecar", "car"]), "")
        self.assertEqual(LongestCommonPrefix().longestCommonPrefix(
            ["ab", "a"]), "a")


if __name__ == '__main__':
    unittest.main()
