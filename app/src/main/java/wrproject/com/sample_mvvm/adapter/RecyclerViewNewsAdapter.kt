package wrproject.com.sample_mvvm.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import wrproject.com.sample_mvvm.databinding.ItemNewsBinding
import wrproject.com.sample_mvvm.model.Article

/**
 * Created by willi on 19/02/2018.
 */
class RecyclerViewNewsAdapter(private var items: List<Article>?,
                                    private var listener: OnItemClickListener)
    : RecyclerView.Adapter<RecyclerViewNewsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent?.context)
        val binding = ItemNewsBinding.inflate(layoutInflater, parent, false)
        return ViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int)
            = holder.bind(items?.get(position)!!, listener)

    override fun getItemCount(): Int = items!!.size

    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }

    fun replaceData(arrayList: List<Article>) {
        items = arrayList
        notifyDataSetChanged()
    }

    class ViewHolder(private var binding: ItemNewsBinding) :
            RecyclerView.ViewHolder(binding.root) {

        fun bind(repo: Article, listener: OnItemClickListener?) {
            binding.article = repo
            if (listener != null) {
                binding.root.setOnClickListener({ _ -> listener.onItemClick(layoutPosition) })
            }

            binding.executePendingBindings()
        }
    }

}
