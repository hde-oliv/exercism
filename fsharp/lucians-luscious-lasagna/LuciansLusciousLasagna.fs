module LuciansLusciousLasagna

// TODO: define the 'expectedMinutesInOven' binding
let expectedMinutesInOven = 40

// TODO: define the 'remainingMinutesInOven' function
let remainingMinutesInOven x = expectedMinutesInOven - x

// TODO: define the 'preparationTimeInMinutes' function
let layerTime = 2
let preparationTimeInMinutes x = x * layerTime

// TODO: define the 'elapsedTimeInMinutes' function
let elapsedTimeInMinutes x y = y + (preparationTimeInMinutes x)
