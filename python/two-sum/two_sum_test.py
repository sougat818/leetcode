import unittest

from two_sum import TwoSum


class MyTest(unittest.TestCase):
    def test(self):
        self.assertEqual(TwoSum().twoSum([2, 7, 11, 15], 9), [1, 0])
        self.assertEqual(TwoSum().twoSum([3, 2, 4], 6), [2, 1])
        self.assertEqual(TwoSum().twoSum([3, 3], 6), [1, 0])


if __name__ == '__main__':
    unittest.main()
