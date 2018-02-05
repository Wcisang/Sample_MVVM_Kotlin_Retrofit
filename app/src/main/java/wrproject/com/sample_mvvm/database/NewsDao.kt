package wrproject.com.sample_mvvm.database

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import io.reactivex.Flowable
import wrproject.com.sample_mvvm.model.News

/**
 * Created by WCisang on 04/02/2018.
 */
@Dao interface NewsDao {

    @Query("select * from news")
    fun getAllNews(): Flowable<List<News>>
}