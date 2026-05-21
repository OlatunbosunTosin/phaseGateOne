const {addition} = require("./listAdditionTarget.js")

test("test for list of numbers that give target number", () => {

    expect(addition([8,6,12,4,-2], 6)).toEqual([8,-2])

})

test("test for list of numbers that give target number", () => {

    expect(addition([1,2,5,7,6,8,9], 12)).toEqual([5,7])

})
