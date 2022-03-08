fun main(){
    var f = arrayOf("becky","fiona","Wendy","Hilda")
    println(f.contentToString())




    var b = arrayOf("Harare", "dodoma","Mumbai","jarkat")
    cities(b)




    var k = arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = k[2]+k[5]
    println(sum)

    var l = k.sortedArray()
    println(l.contentToString())

    var p = (k.indexOf(158))
    println(p)






    details(arrayOf("Hilda","You","Sakina"))

}


fun array(Name:Array<String>){
    var w =(Name)
    println(w)
}


fun cities(name:Array<String>){
    name.forEach { name ->
        println(name.capitalize())
    }
}


fun numbers(number:Array<Int> ){
    println()
}



fun details(Name:Array<String>):Array<String>{
    var r = (Name)
    println(Name.contentToString())
    return r
}