package com.example.pht_first_demo.Version_3

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.pht_first_demo.R

class V3_ViewListHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val viewPicture: ImageView = itemView.findViewById(R.id.viewPicture)
    private val titleViewText: TextView = itemView.findViewById(R.id.titleViewText)
    private val authorViewText: TextView = itemView.findViewById(R.id.authorViewText)
    private val updateViewText: TextView = itemView.findViewById(R.id.updateViewText)
    private val typeViewText: TextView = itemView.findViewById(R.id.typeViewText)
    private val fireViewText: TextView = itemView.findViewById(R.id.fireViewText)
    private val goodViewText: TextView = itemView.findViewById(R.id.goodViewText)
    private val topViewPicture: ImageView = itemView.findViewById(R.id.topViewPicture)

    fun setData(data: ArrayList<String>){
        viewPicture.setImageResource(data[0].toInt())
        titleViewText.text = data[1]
        authorViewText.text = data[2]
        updateViewText.text = data[3]
        typeViewText.text = data[4]
        fireViewText.text = data[5]
        goodViewText.text = data[6]
        topViewPicture.setImageResource(data[7].toInt())
    }


}