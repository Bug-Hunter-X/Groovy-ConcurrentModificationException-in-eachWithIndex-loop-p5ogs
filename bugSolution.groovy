```groovy
def myMethod(List<String> list) {
    Iterator<String> iter = list.iterator()
    while(iter.hasNext()){
        String item = iter.next()
        if(item == "someValue"){
            iter.remove()
        }
    }
}

List<String> myList = ["value1", "someValue", "value3"]
myMethod(myList)
println myList

//Alternative solution using a copy
def myMethod2(List<String> list) {
    List<String> newList = []
    list.each { item ->
        if(item != "someValue"){
            newList << item
        }
    }
    return newList
}

myList = ["value1", "someValue", "value3"]
myList = myMethod2(myList)
println myList
```