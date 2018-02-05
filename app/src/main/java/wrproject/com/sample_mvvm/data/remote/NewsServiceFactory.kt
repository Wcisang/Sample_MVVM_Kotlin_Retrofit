package wrproject.com.sample_mvvm.data.remote

import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory

/**
 * Created by willi on 04/02/2018.
 */
class NewsServiceFactory {

    fun getNewsService() : NewsService{
        val retrofit = Retrofit.Builder()
                .addCallAdapterFactory(
                        RxJava2CallAdapterFactory.create())
                .addConverterFactory(
                        GsonConverterFactory.create())
                .baseUrl("https://newsapi.org")
                .build()

        return retrofit.create(NewsService::class.java)
    }
}