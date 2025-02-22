package com.example.movieslider

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.movieslider.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var imageList: ArrayList<Int>
    private lateinit var adapter: ImageAdapter
    private var currentMovieIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
        setUpTransformer()
        updateMovieInfo(currentMovieIndex)

        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)

                currentMovieIndex = position % MovieDataProvider.movies.size
                updateMovieInfo(currentMovieIndex)
            }
        })
    }

    private fun updateMovieInfo(index: Int) {
        val movie = MovieDataProvider.movies[index]
        binding.movieTitle.text = movie.title
        binding.releaseDate.text = "Fecha de lanzamiento: ${movie.releaseDate}"
        binding.mainActors.text = movie.actors.joinToString("\n") { "• $it" }
        binding.description.text = movie.description

        binding.websiteButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(movie.websiteUrl))
            startActivity(intent)
        }
    }

    private fun init() {
        imageList = ArrayList()
        imageList.add(R.drawable.shrek1)
        imageList.add(R.drawable.iceage1)
        imageList.add(R.drawable.cars1)
        imageList.add(R.drawable.matrix1)
        imageList.add(R.drawable.gladiator1)
        imageList.add(R.drawable.shrek2)

        adapter = ImageAdapter(imageList)
        binding.viewPager.adapter = adapter
    }

    private fun setUpTransformer() {
        val transformer = ViewPager2.PageTransformer { page, position ->
            val r = 1 - kotlin.math.abs(position)
            page.scaleY = 0.85f + r * 0.15f
        }
        binding.viewPager.setPageTransformer(transformer)
    }
}