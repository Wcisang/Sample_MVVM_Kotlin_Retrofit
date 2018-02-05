package wrproject.com.sample_mvvm

import android.app.Application
import android.arch.persistence.room.Room
import wrproject.com.sample_mvvm.database.AppDataBase

/**
 * Created by willi on 04/02/2018.
 */
class CustomApplication: Application() {

    companion object {
        var database :  AppDataBase? = null
    }

    override fun onCreate() {
        super.onCreate()
        CustomApplication.database = Room.databaseBuilder(this, AppDataBase::class.java, "News-DB").build()
    }
}