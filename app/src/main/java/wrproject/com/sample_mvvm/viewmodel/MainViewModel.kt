package wrproject.com.sample_mvvm.viewmodel

import android.app.Application
import android.arch.lifecycle.AndroidViewModel
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import wrproject.com.sample_mvvm.data.NewsRepository
import wrproject.com.sample_mvvm.model.News
import wrproject.com.sample_mvvm.util.NetworkUtil

/**
 * Created by WCisang on 04/02/2018.
 */
class MainViewModel(application: Application) : AndroidViewModel(application){

    var newsRepository : NewsRepository = NewsRepository(NetworkUtil(getApplication()))

    fun loadNews(){
        newsRepository.getNews()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe { t: List<News> ->  }

    }

    fun setList(list: List<News>){
        var size = list.size
        print(size)
    }
}
