package wrproject.com.sample_mvvm.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by WCisang on 04/02/2018.
 */
@Entity(tableName = "news")
class News(@PrimaryKey(autoGenerate = false)
           val title: String,

           @ColumnInfo(name = "description")
           val description: String,

           @ColumnInfo(name = "author")
           val author: String,

           @ColumnInfo(name = "url")
           val url: String,

           @ColumnInfo(name = "urlToImage")
           val urlToImage: String,

           @ColumnInfo(name = "publishedAt")
           val publishedAt: String,

           @ColumnInfo(name = "name")
           val name: String)



