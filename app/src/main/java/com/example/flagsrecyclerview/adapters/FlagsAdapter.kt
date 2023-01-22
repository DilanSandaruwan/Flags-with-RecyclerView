package com.example.flagsrecyclerview.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.flagsrecyclerview.MainActivity
import com.example.flagsrecyclerview.R

class FlagsAdapter(context:Context,private val countryNames: List<String>, private val countryFlags: List<Int>) :
    RecyclerView.Adapter<FlagsAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val tvCountry: TextView
        val ivFlag: ImageView
        val cbCountry: CheckBox

        init {
            tvCountry = view.findViewById(R.id.tvName)
            ivFlag = view.findViewById(R.id.ivFlag)
            cbCountry = view.findViewById(R.id.cbCountry)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):
            ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.flag_item, parent, false
            )

        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.ivFlag.setImageResource(
            countryFlags.get(position)
        )
        holder.tvCountry.text = countryNames.get(position).toString()
        holder.itemView.setOnClickListener(View.OnClickListener {
            // click event goes here
        })
    }

    override fun getItemCount(): Int {
        return countryFlags.size
    }
}