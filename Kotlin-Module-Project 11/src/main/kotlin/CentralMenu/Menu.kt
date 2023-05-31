package CentralMenu

import java.util.*

abstract class Menu {


    abstract val menuName: String

    open fun <T : MenuItem> showMenu(items: MutableList<T>) {
        println(menuName)// Если я как то исправляю код чтобы он хоть как то работал, то всё что ниже
            //В этой функции не работает и я не вижу пунктов меню но они функционируют!
            //проще говоря все классы отказываются запускать цикл for
        for (i in 0..items.lastIndex) {
            println("$i. ${items[i].name}")
        }
    }

    open fun exeptions(elements : Int) : Int{

        while (true){
           try {
               val userInputMenuItem = Scanner(System.`in`).nextInt()
               if (userInputMenuItem > elements) {
                   println("Пожалуйста введите число из представленных")
                   continue
               }
                   return userInputMenuItem


           } catch (i : InputMismatchException){
               println("Пожалуйста введите ЧИСЛО из представленных")
           }

        }

    }

}