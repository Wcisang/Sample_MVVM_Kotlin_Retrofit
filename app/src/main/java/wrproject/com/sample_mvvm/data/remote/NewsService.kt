package wrproject.com.sample_mvvm.data.remote

import io.reactivex.Flowable
import retrofit2.http.GET
import retrofit2.http.Query
import wrproject.com.sample_mvvm.model.News


/**
 * Created by willi on 04/02/2018.
 */
interface NewsService {

    @GET("/v2/top-headlines")
    fun getRemoteNews(@Query("country")country: String, @Query("apiKey")apiKey : String): Flowable<List<News>>
}