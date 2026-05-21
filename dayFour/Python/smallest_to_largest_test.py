import unittest
import smallest_to_largest

class TestForArrayContainingSmallestToLargestNumber(unittest.TestCase):

    def test_for_list_of_smallest_to_largest(self):
    
        expected_list = [1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19];
        actual_list = smallest_to_largest.smallest_to_largest_of([5,19,5,1,6])
        self.assertListEqual(expected_list,actual_list)
        
        expected_list = [2,3,4,5,6,7,8,9,10];
        actual_list = smallest_to_largest.smallest_to_largest_of([10,6,3,2])
        self.assertListEqual(expected_list,actual_list)
     
