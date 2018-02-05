package wrproject.com.sample_mvvm.util

import android.content.Context
import android.net.ConnectivityManager

/**
 * Created by WCisang on 04/02/2018.
 */
class NetworkUtil(private var applicationContext: Context) {
    private var status: Boolean? = false

    val isConnectedToInternet: Boolean?
        get() {
            val conManager = applicationContext.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
            val ni = conManager.activeNetworkInfo
            return ni != null && ni.isConnected
        }
}