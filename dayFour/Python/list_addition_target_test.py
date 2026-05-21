import unittest
import list_addition_target

class TestForNumbersThatReturnSumOfTargetNumbers(unittest.TestCase):

    def test_for_the_list_that_gives_target_number(self):
    
        expected_list = [8,-2]
        actual_list = list_addition_target.addition([8,6,12,4,-2], 6)
        self.assertListEqual(expected_list,actual_list)
        
        expected_list = [5,7]
        actual_list = list_addition_target.addition([1,2,5,7,6,8,9], 12)
        self.assertListEqual(expected_list,actual_list)
