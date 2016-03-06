// more awesome examples on http://grails.asia/groovy-map-tutorial

def myMap = new HashMap<String, Object>() // can instance on the java way

myMap.put("name", "Elvis"); // can use semicolon or not
myMap.put("age", 21)

println "map way 01"
println myMap
println "==================="

Map myMap2 = [:]

myMap2.put("name", "Charlie Sheen"); 
myMap2.put("age", 43)

println "map way 02"
println myMap2
println "==================="


// see the bellow examples and be CRAZY !!!
Map myMap3 = [childs: 12]

myMap3.name = "Charlie Sheen" 
myMap3["age"] = 43;

println "map way 03"
println myMap3
println "==================="

