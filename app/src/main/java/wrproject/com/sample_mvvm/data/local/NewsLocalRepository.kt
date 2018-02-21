package wrproject.com.sample_mvvm.data.local

import io.reactivex.Flowable
import wrproject.com.sample_mvvm.CustomApplication
import wrproject.com.sample_mvvm.model.News
import wrproject.com.sample_mvvm.model.NewsArticles

/**
 * Created by WCisang on 04/02/2018.
 */
class NewsLocalRepository{

    fun getNews() : Flowable<NewsArticles>{
        return CustomApplication.database?.getNewsDao()!!.getAllNews()
    }

}