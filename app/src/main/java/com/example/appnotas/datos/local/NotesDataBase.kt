package com.example.appnotas.datos.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.appnotas.datos.local.dao.NoteDao
import com.example.appnotas.datos.local.entities.NoteEntity

@Database(entities = [NoteEntity::class], version = 1, exportSchema = false)
abstract class NotesDataBase : RoomDatabase() {

    abstract fun noteDao(): NoteDao
}
