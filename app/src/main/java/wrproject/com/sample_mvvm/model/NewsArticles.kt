package wrproject.com.sample_mvvm.model

import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Relation

/**
 * Created by willi on 06/02/2018.
 */
class NewsArticles {

    @Embedded
    var news: News? = null

    @Relation(parentColumn = "idNews", entityColumn = "idArticle")
    var articles: List<Article> = ArrayList<Article>()
}