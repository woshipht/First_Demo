package com.example.pht_first_demo.Version_3

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.pht_first_demo.R
import java.util.ArrayList

class V3_ViewAdapter(private val data: List<ArrayList<String>> ?) : RecyclerView.Adapter<V3_ViewListHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): V3_ViewListHolder {
        val view = View.inflate(parent.context, R.layout.item_view, null)
        return V3_ViewListHolder(view)
    }

    override fun onBindViewHolder(holder: V3_ViewListHolder, position: Int) {
        holder.setData(data!![position])
    }

    override fun getItemCount(): Int {
        return data?.size ?: 0
    }
}