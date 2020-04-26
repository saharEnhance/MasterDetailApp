package com.example.masterdetailapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var movies: MutableList<Movie> = mutableListOf(
        Movie("The Shawshank Redemption", "1994"),
        Movie("The Godfather", "1972"),
        Movie("The godfather:part||", "1974")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }


    private fun initRecyclerView() {

        movieList.layoutManager = LinearLayoutManager(this)
        movieList.adapter = movieListAdapter(movies as MutableList<Movie>) { movie : String -> partItemClicked(movie) }
        //movieList.adapter = adapter
    }
    private fun partItemClicked(movie: String) {
        Toast.makeText(this, "Clicked: $movie", Toast.LENGTH_LONG).show()
    }
}
