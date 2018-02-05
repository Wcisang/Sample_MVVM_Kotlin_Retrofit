package wrproject.com.sample_mvvm.data.remote

import io.reactivex.Flowable
import wrproject.com.sample_mvvm.BuildConfig
import wrproject.com.sample_mvvm.model.News

/**
 * Created by WCisang on 04/02/2018.
 */
class NewsRemoteRepository{

    fun getNews() : Flowable<List<News>> {
        return NewsServiceFactory().getNewsService().getRemoteNews("br", BuildConfig.NEWS_API_KEY)
    }

}