package com.zynastor.crudnoteappcompose.feature_note.presentation.notes

import com.zynastor.crudnoteappcompose.feature_note.domain.model.Note
import com.zynastor.crudnoteappcompose.feature_note.domain.util.NoteOrder

sealed interface NotesEvent {
    data class Order(val noteOrder: NoteOrder):NotesEvent
    data class DeleteNote(val note: Note):NotesEvent
    object RestoreNote:NotesEvent
    object ToggleOrderSection:NotesEvent
}