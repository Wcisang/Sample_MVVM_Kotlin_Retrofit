package wrproject.com.sample_mvvm

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import wrproject.com.sample_mvvm.adapter.RecyclerViewNewsAdapter
import wrproject.com.sample_mvvm.databinding.ActivityMainBinding
import wrproject.com.sample_mvvm.model.Article
import wrproject.com.sample_mvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity(), RecyclerViewNewsAdapter.OnItemClickListener {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)
        binding.viewModel = viewModel
        binding.rvNews.layoutManager = LinearLayoutManager(this)
        var adapter = RecyclerViewNewsAdapter(viewModel.articles.value,this)
        binding.rvNews.adapter = adapter

        viewModel.articles.observe(this,
                Observer<List<Article>> { it?.let{ adapter.replaceData(it)} })

        binding.executePendingBindings()
    }

    override fun onItemClick(position: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}
