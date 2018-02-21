package wrproject.com.sample_mvvm.model

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey
import android.databinding.BaseObservable
import android.databinding.Bindable
import wrproject.com.sample_mvvm.BR

/**
 * Created by willi on 06/02/2018.
 */
@Entity(tableName = "article")
class Article(title: String, description: String) : BaseObservable() {

    @PrimaryKey(autoGenerate = false)
    @ColumnInfo(name = "idArticle")
    var idArticle: Int = 0

    @ColumnInfo(name = "title")
    @get:Bindable
    var title : String = title
        set(value) {
            field = value
            notifyPropertyChanged(BR.title)
        }

    @ColumnInfo(name = "description")
    @get:Bindable
    var description: String = description
        set(value) {
            field = value
            notifyPropertyChanged(BR.description)
        }

    @ColumnInfo(name = "author")
    var author: String = ""

    @ColumnInfo(name = "url")
    var url: String = ""

    @ColumnInfo(name = "urlToImage")
    @get:Bindable
    var urlToImage: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.urlToImage)
        }

    @ColumnInfo(name = "publishedAt")
    var publishedAt: String = ""

    @ColumnInfo(name = "name")
    var name: String = ""


}

