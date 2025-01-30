```groovy
def myMethod(List<String> list) {
  // Create a copy to avoid modifying the original list
  List<String> newList = new ArrayList<>(list)
  newList.each { println it }
  newList = [] // Modifying the copy
}

List<String> myList = ['a', 'b', 'c']
myMethod(myList)
println myList // myList is still ['a', 'b', 'c']
```