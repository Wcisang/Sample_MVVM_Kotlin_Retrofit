package wrproject.com.sample_mvvm.database

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import wrproject.com.sample_mvvm.model.News

/**
 * Created by WCisang on 04/02/2018.
 */
@Database(entities = arrayOf(News::class), version = 1, exportSchema = false)
abstract class AppDataBase : RoomDatabase(){

    abstract fun getNewsDao() : NewsDao
}