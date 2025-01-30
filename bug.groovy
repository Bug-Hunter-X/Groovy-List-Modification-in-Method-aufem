```groovy
def myMethod(List<String> list) {
  list.each { println it }
  list = [] // Modifying the input list
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
println myList // myList is still ['a', 'b', 'c']
```