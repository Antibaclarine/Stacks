fun main(){
 var str="hello"
    var result= mutableListOf<Char>()
    var stacks=Stacks()
    str.forEach { c->stacks.push(c) }
    while (!stacks.isEmpty()){
        result.add(stacks.pop()!!)

    }
    println(result.joinToString(""))
 var myStack=Stack()
    println(myStack.pop())
    myStack.push(5)
    myStack.push(24)
    myStack.push(62)
    println(myStack.pop())
    println(myStack.peek())
    println(myStack.pop())
    myStack.push(14)
    myStack.push(51)
    myStack.push(88)
    var x=myStack.pop()
    var y=myStack.pop()
    var z=x!! +y!!
    println(z)
}
class Stack{
    var data= mutableListOf<Int>()
    fun  push(value: Int){
        data.add((value))
    }
    fun pop():Int? {
        if (data.isEmpty()) {
            return null
        }


        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return  null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return  data.isEmpty()
    }
}
class Stacks{
    var data= mutableListOf<Char>()
    fun  push(value: Int){
        data.add((value))
    }
    fun pop():Int? {
        if (data.isEmpty()) {
            return null
        }


        var top = data[data.lastIndex]
        data.removeAt(data.lastIndex)
        return top
    }
    fun peek():Int?{
        if (data.isEmpty()){
            return  null
        }
        return data[data.lastIndex]
    }
    fun isEmpty():Boolean{
        return  data.isEmpty()
    }
}