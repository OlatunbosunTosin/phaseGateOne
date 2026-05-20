const{spaceAvailability, spaceFilled} = require("./MiniParkingSystem.js")


test("test for available space", () => {
    
    slot = [1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1];
       
    expect(spaceAvailability(slot,10,"yes")).toBe(9);
})
    
test("test for filled space", () => {
    
    slot = [1,0,0,1,1,0,1,0,1,1,1,1,0,0,0,1,0,0,1,1];
       
    expect(spaceFilled(slot,10,"yes")).toBe(11);
})
    

