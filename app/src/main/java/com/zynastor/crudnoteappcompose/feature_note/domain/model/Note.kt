package com.zynastor.crudnoteappcompose.feature_note.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.zynastor.crudnoteappcompose.ui.theme.BabyBlue
import com.zynastor.crudnoteappcompose.ui.theme.LightGreen
import com.zynastor.crudnoteappcompose.ui.theme.RedOrange
import com.zynastor.crudnoteappcompose.ui.theme.RedPink
import com.zynastor.crudnoteappcompose.ui.theme.Violet

@Entity
data class Note(
    val title: String,
    val content: String,
    val timestamp: Long,
    val color: Int,
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val noteColors = listOf(RedOrange, LightGreen, Violet, BabyBlue, RedPink)
    }
}

class InvalidNoteException(message: String) : Exception(message)