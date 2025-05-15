package AmandaCornelsen.github.com.lista_de_compras_kotlin.data

import AmandaCornelsen.github.com.lista_de_compras_kotlin.model.ItemModel
import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [ItemModel::class], version = 1)
abstract class ItemDatabase : RoomDatabase() {
    abstract fun itemDao(): ItemDao
}