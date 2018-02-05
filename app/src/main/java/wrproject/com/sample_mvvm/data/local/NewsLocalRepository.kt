package wrproject.com.sample_mvvm.data.local

import io.reactivex.Flowable
import wrproject.com.sample_mvvm.CustomApplication
import wrproject.com.sample_mvvm.model.News

/**
 * Created by WCisang on 04/02/2018.
 */
class NewsLocalRepository{

    fun getNews() : Flowable<List<News>>{
        return CustomApplication.database?.getNewsDao()!!.getAllNews()
    }

}