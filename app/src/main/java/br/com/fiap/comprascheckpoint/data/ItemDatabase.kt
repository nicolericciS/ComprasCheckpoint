package br.com.fiap.comprascheckpoint.data

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.fiap.comprascheckpoint.model.ItemModel

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {

    abstract fun itemDao(): ItemDao
}