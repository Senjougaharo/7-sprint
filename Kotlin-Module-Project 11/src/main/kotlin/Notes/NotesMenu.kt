package Notes

import CentralMenu.Menu
import CentralMenu.MenuItem
import java.util.*

  class NotesMenu(override val name: MutableList<String>) : Menu(), MenuItem {


      override val menuName = "Заметки"

    fun addNotes(menu: MutableList<Notes>){
        println("Введите название:")
        val name = Scanner(System. `in` ).nextLine()

        println("Введите текст:")
        val text = Scanner(System.`in`).nextLine()

        menu.add(menu.lastIndex, Notes(name,text))
        println("Вы сделали заметку!")
    }


      fun notesInteractions(menu : MutableList<Notes>){

          if (menu.size == 0) {

              menu.add(Notes("Создать заметку:", ""))
              menu.add(Notes("Выход", ""))
          }
          while (true) {

              showMenu(items)


              val elements = name.lastIndex

              when (val menuItem = exeptions(elements)) {

                  0 -> addNotes(menu)
                  menu.lastIndex -> return
                  else -> println(menu[menuItem].text)
              }
          }}
          }


