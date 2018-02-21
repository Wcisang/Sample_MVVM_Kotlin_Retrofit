package wrproject.com.sample_mvvm.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import android.arch.lifecycle.MutableLiveData
import android.util.Log
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import wrproject.com.sample_mvvm.data.NewsRepository
import wrproject.com.sample_mvvm.model.Article
import wrproject.com.sample_mvvm.model.News
import wrproject.com.sample_mvvm.model.NewsArticles
import wrproject.com.sample_mvvm.util.NetworkUtil

/**
 * Created by WCisang on 04/02/2018.
 */
class MainViewModel(application: Application) : AndroidViewModel(application){

    var articles = MutableLiveData<List<Article>>()

    var newsRepository : NewsRepository = NewsRepository(NetworkUtil(getApplication()))

    init {
        articles.value = ArrayList<Article>()
    }

    fun loadNews(){
        newsRepository.getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { t: NewsArticles ->  setList(t)}
    }

    fun setList(news: NewsArticles){
        articles.value = news.articles
    }
}
