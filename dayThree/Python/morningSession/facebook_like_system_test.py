import unittest
import facebook_like_system

class TestForLikesOfFacebookPages(unittest.TestCase):

    def test_for_empty_list(self):
        like = []
        expectedList = facebook_like_system.facebook_likes(like)
        displayText = "no one likes this"
        self.assertEqual(expectedList, displayText)
        
    def test_for_one_element_in_list(self):
    
        expectedList = facebook_like_system.facebook_likes(["Peter"])
        displayText = "Peter likes this"
        self.assertEqual(expectedList, displayText)
        
    def test_for_two_elements_in_list(self):
    
        expectedList = facebook_like_system.facebook_likes(["Jacob","Alex"])
        displayText = "Jacob and Alex like this"
        self.assertEqual(expectedList, displayText)
        
    def test_for_three_elements_in_list(self):
    
        expectedList = facebook_like_system.facebook_likes(["Max","John","Mark"])
        displayText = "Max, John and Mark like this"
        self.assertEqual(expectedList, displayText)
        
    def test_for_four_elements_in_list(self):
    
        expectedList = facebook_like_system.facebook_likes(["Alex","Jacob","Mark","Max"])
        displayText = "Alex, Jacob and 2 others like this"
        self.assertEqual(expectedList, displayText)
