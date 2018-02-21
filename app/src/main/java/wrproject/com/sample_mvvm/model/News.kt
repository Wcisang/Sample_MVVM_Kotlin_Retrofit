package wrproject.com.sample_mvvm.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by WCisang on 04/02/2018.
 */
@Entity(tableName = "News")
class News
(
        @PrimaryKey(autoGenerate = true)
        @ColumnInfo(name = "idNews")
        val idNews: Int,


        @ColumnInfo(name = "date")
        val date: String
)



