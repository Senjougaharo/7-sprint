package Archive

import CentralMenu.Menu
import CentralMenu.MenuItem
import Notes.Notes
import Notes.NotesMenu
import java.util.*
import kotlin.system.exitProcess

class ArchiveMenu: Menu(), MenuItem {

    val notes = NotesMenu()

    override val name: MutableList<String> = mutableListOf("Создать архив:", "Завершение работы")

    override val menuName = "Архивы"
    fun addArchive(){
        println("Введите название:")
        val userInput = Scanner(System.`in`).nextLine()
        name.add(name.lastIndex, userInput)

    }



    fun interectionWithArchiveMenu() :MutableList<Notes>{
        while(true){

            showMenu(items)
            //не понимаю почему казалось бы Дженерик выведеный мной в общем Menu не превращается
            //в другой вид, как мне тогда сделать общую логику? Я уже всё попробовал по ощущениям

            val elements = name.lastIndex

            when (val menuItem = exeptions(elements)) {

                0 -> addArchive()
                name.lastIndex -> exitProcess(0)
                else -> notes.notesInteractions(name[menuItem].notes)
                    //Я не понимаю почему notes что бы я не делал отмечен красным и Archive поле notes не
                    //хочет "активироваться"


            }
        }

    }




}