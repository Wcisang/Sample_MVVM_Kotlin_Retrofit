package wrproject.com.sample_mvvm.data

import io.reactivex.Flowable
import wrproject.com.sample_mvvm.data.local.NewsLocalRepository
import wrproject.com.sample_mvvm.data.remote.NewsRemoteRepository
import wrproject.com.sample_mvvm.model.NewsArticles
import wrproject.com.sample_mvvm.util.NetworkUtil

/**
 * Created by WCisang on 04/02/2018.
 */
class NewsRepository(val networkUtil: NetworkUtil) {

    private val localDataSource = NewsLocalRepository()
    private val remoteDataSource = NewsRemoteRepository()

    fun getNews(): Flowable<NewsArticles> {
        networkUtil.isConnectedToInternet?.let {
            if (it) {
                return remoteDataSource.getNews()
            }
        }
        return localDataSource.getNews()
    }

}