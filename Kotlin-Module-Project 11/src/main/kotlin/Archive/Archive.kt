package Archive

import CentralMenu.MenuItem
import Notes.Notes

class Archive(
    override val name: MutableList<String>,
    val notes: MutableList<Notes>


): MenuItem