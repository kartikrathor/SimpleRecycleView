package com.example.promaticsindia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_recycle_view.*

class RecycleViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycle_view)



      val songsObjects: MutableList<Song> = mutableListOf<Song>()
        songsObjects.add(Song("Kotlin","Kotlin is more faster"))
        songsObjects.add(Song("Java","Java is more easier"))
        songsObjects.add(Song("JavaScript","Java is more Popular"))
        songsObjects.add(Song("Python","Python is more famous"))
        songsObjects.add(Song("Ruby","Ruby is more knowladgable"))
        songsObjects.add(Song("C","Mother Language of all languages"))
        songsObjects.add(Song("C++","Similar to java"))
        songsObjects.add(Song("Android","Always popular"))
        songsObjects.add(Song("Flutter","Build app for ios and android"))
        songsObjects.add(Song("NodeJS","NPM is more powerful"))
        songsObjects.add(Song("HTML","Easy and simple"))

        songList.adapter = MyAdapter(songsObjects)
        songList.layoutManager = LinearLayoutManager(this)




    }
}
