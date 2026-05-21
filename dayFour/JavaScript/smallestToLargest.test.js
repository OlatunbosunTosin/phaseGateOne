const {smallestToLargestOf} = require("./smallestToLargest.js")

test("test that list of numbers from smallest to largest is returned", () => {

    expect(smallestToLargestOf([5,19,5,1,6])).toEqual([1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19])

})

test("test that list of numbers from smallest to largest is returned", () => {

    expect(smallestToLargestOf([10,6,3,2])).toEqual([2,3,4,5,6,7,8,9,10])

})

