import unittest
import mini_parking_system

class TestMiniParkingSystem(unittest.TestCase):

    def test_for_available_space(self):
    
        slot = [1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1]
       
        self.assertEqual(mini_parking_system.space_availability(slot,10,"yes"), 9)
    
    def test_for_filled_space(self):
    
        slot = [1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1]
       
        self.assertEqual(mini_parking_system.space_filled(slot,10,"yes"), 11)
    

