package com.example.flagsrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.flagsrecyclerview.adapters.FlagsAdapter

class MainActivity : AppCompatActivity() {

    private lateinit var layoutManager: LayoutManager
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: FlagsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val countryNames = listOf<String>(
            splitCountryNames(resources.getString(R.string.argentina)),
            splitCountryNames(resources.getString(R.string.australia)),
            splitCountryNames(resources.getString(R.string.bangladesh)),
            splitCountryNames(resources.getString(R.string.canada)),
            splitCountryNames(resources.getString(R.string.china)),
            splitCountryNames(resources.getString(R.string.finland)),
            splitCountryNames(resources.getString(R.string.france)),
            splitCountryNames(resources.getString(R.string.great_britain)),
            splitCountryNames(resources.getString(R.string.india)),
            splitCountryNames(resources.getString(R.string.japan)),
            splitCountryNames(resources.getString(R.string.norway)),
            splitCountryNames(resources.getString(R.string.pakistan)),
            splitCountryNames(resources.getString(R.string.srilanka)),
            splitCountryNames(resources.getString(R.string.united_states))
        )
        val countryFlags = listOf<Int>(
            R.drawable.argentina,
            R.drawable.australia,
            R.drawable.bangladesh,
            R.drawable.canada,
            R.drawable.china,
            R.drawable.finland,
            R.drawable.france,
            R.drawable.great_britain,
            R.drawable.india,
            R.drawable.japan,
            R.drawable.norway,
            R.drawable.pakistan,
            R.drawable.srilanka,
            R.drawable.united_states,
        )

        recyclerView = findViewById(R.id.recyclerView)
        adapter = FlagsAdapter(this,countryNames, countryFlags)
        layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter
    }

    private fun splitCountryNames(name: String): String {
        return name.split("--")[1]
    }


}