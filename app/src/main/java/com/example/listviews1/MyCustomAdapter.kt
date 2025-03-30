package com.example.listviews1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import org.w3c.dom.Text

class MyCustomAdapter (var ctx : Context, var ourResource: Int,
                       var Items : ArrayList<Model>): ArrayAdapter<Model>(ctx, ourResource, Items){
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        val layoutInflater = LayoutInflater.from(ctx)
        val view = layoutInflater.inflate(ourResource, null)

        val name = view.findViewById<TextView>(R.id.textView)
        val tagline = view.findViewById<TextView>(R.id.textView2)
        val img = view.findViewById<ImageView>(R.id.imageView)

        name.text= Items[position].name
        tagline.text = Items[position].tagLine
        img.setImageDrawable(ctx.resources.getDrawable(Items[position].img))

        return view
    }

}