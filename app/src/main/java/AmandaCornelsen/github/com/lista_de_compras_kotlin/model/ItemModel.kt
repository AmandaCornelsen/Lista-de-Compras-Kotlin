package AmandaCornelsen.github.com.lista_de_compras_kotlin.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class ItemModel(

    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,

    val name: String
)