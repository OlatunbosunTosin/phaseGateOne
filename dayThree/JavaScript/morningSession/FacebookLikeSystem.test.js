const {facebookLikes} = require("./FacebookLikeSystem")


test("test for empty list", () => {

    like = []
    expect(facebookLikes(like)).toBe("no one likes this")


})

test("test for one element in list", () => {

    like = ["Peter"]
    expect(facebookLikes(like)).toBe("Peter likes this")


})

test("test for two elements in list", () => {

    like = ["Jacob","Alex"]
    expect(facebookLikes(like)).toBe("Jacob and Alex like this")


})

test("test for three elements in list", () => {

    like = ["Max","John","Mark"]
    expect(facebookLikes(like)).toBe("Max, John and Mark like this")


})
        
test("test for three elements in list", () => {

    like = ["Alex","Jacob","Mark","Max"]
    expect(facebookLikes(like)).toBe("Alex, Jacob and 2 others like this")


})    
        
        
        

