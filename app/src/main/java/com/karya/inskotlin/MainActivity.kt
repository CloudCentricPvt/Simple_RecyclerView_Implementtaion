package com.karya.inskotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView   // The variable declared using var(Mutable) keyword can be changed later in the program. It corresponds to regular Java variable.
    private lateinit var newArrayList: ArrayList<KtModel>
    lateinit var pic: Array<Int>
    lateinit var text: Array<String>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pic = arrayOf(
            R.drawable.harmonium,
            R.drawable.guitar,
            R.drawable.piano,
            R.drawable.trumpet,
            R.drawable.veena,
            R.drawable.flute
        )
        text = arrayOf(
            "Harmonium",
            "Guitar",
            "Piano",
            "Trumpet",
            "Veena",
            "Flute"
        )
        recyclerView = findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        newArrayList = arrayListOf<KtModel>()
        getUserdata()
    }
    private fun getUserdata() {
        for (i in pic.indices) {
            val ktModel = KtModel(pic[i], text[i])  // The variable declared using val(Immutable) keyword cannot be changed once the value is assigned. It is similar to final variable in Java.
            newArrayList.add(ktModel)
        }
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = KtAdapter(newArrayList)
    }
}