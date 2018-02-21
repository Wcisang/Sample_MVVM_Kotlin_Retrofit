package wrproject.com.sample_mvvm.util

import android.databinding.BindingAdapter
import android.widget.ImageView
import com.squareup.picasso.Picasso

/**
 * Created by willi on 19/02/2018.
 */
@BindingAdapter("urlToImage")
fun loadImage(view: ImageView, _imageUrl: String?) {
    var imageUrl = _imageUrl
    if (imageUrl == null || imageUrl.isEmpty())
        imageUrl = "http://www.physiotherapyns.ca/images/default_news.png"
    Picasso.with(view.context).load(imageUrl).into(view)
}

