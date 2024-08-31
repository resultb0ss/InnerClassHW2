fun main() {
    var array = arrayOf("Иванов","Петров","Сидоров","Процветов","Протасов")


    while (true) {
        println("Введите символ для поиска, если хотите завершить нажмите 2")
        var input = readln()
        println("Возможно вы искали?")
        for (elem in array) {
            if (elem.contains(input, ignoreCase = true))
                println(elem)
        }
        if (input == "2") {
            println("Спасибо! Хорошего дня!")
            break
        }
    }
}