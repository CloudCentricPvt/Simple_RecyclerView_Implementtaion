package com.karya.inskotlin

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KtAdapter(private val list : ArrayList<KtModel>): RecyclerView.Adapter<KtAdapter.ViewHolder>(){


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder{

        // onCreateViewHolder: Create ViewHolder then ViewHolder Hold the Views in it.
        // Layout Inflater Inflate/Convert the xml[custom_design] file to Java Objects.
        val inflater  = LayoutInflater.from(parent.context)
        val itemView = inflater.inflate(R.layout.custom_design, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem = list[position]
        holder.pic.setImageResource(currentItem.pic)
        holder.text.text = currentItem.text
    }

    override fun getItemCount(): Int {

        return list.size  // here list is the val which we define above in line no. 10
    }

    class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){

        val pic : ImageView = itemView.findViewById(R.id.imageView)
        val text : TextView = itemView.findViewById(R.id.textView)
    }
}