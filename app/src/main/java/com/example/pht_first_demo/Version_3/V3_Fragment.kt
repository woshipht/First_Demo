package com.example.pht_first_demo.Version_3

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pht_first_demo.R
import java.util.*

class V3_Fragment(private val ifHottest: Boolean, val title: String) : Fragment() {
    private var root: View ?= null
    private var recyclerView: RecyclerView ?= null
    private var mData = ArrayList<ArrayList<String>>()
    private var adapter: V3_ViewAdapter? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        if(root == null){
            root = inflater.inflate(R.layout.v3_fragment, container, false)
        }

        recyclerView = root!!.findViewById(R.id.v3_switchView)

        initData()
        return root
    }

    private fun initData() {
        mData = if (ifHottest){
            generateDataOfHottest()
        }else{
            generateDataOfNewest()
        }

        val linearLayoutManager = LinearLayoutManager(activity)
        recyclerView!!.layoutManager = linearLayoutManager

        adapter = V3_ViewAdapter(mData)

        recyclerView!!.adapter = adapter
    }

    private fun generateDataOfHottest(): ArrayList<ArrayList<String>> {
        val information = ArrayList<ArrayList<String>>()
        val subArrayList1 = ArrayList(
            listOf(
                java.lang.String.valueOf(R.mipmap.picture_1),
                "风犬少年的天空",
                "作者：铃木勇马",
                "更新：第2集 / 共10集",
                "类型：青春 / 喜剧",
                "19.7w",
                "920.6w",
                java.lang.String.valueOf(R.mipmap.top_1)
            )
        )
        val subArrayList2 = ArrayList(
            listOf(
                java.lang.String.valueOf(R.mipmap.picture_2),
                "我是大哥大",
                "作者：铃木勇马",
                "更新：第3集 / 共20集",
                "类型：青春 / 喜剧",
                "19.7w",
                "920.6w",
                java.lang.String.valueOf(R.mipmap.top_2)
            )
        )
        val subArrayList3 = ArrayList(
            listOf(
                java.lang.String.valueOf(R.mipmap.picture_3),
                "你是我的城池营垒",
                "作者：张彤",
                "更新：第3集 / 共20集",
                "类型：青春 / 喜剧",
                "19.7w",
                "920.6w",
                java.lang.String.valueOf(R.mipmap.top_3)
            )
        )
        information.add(subArrayList1)
        information.add(subArrayList2)
        information.add(subArrayList3)
        information.add(subArrayList1)
        information.add(subArrayList2)
        information.add(subArrayList3)
        return information
    }

    private fun generateDataOfNewest(): ArrayList<ArrayList<String>> {
        val information = ArrayList<ArrayList<String>>()
        val subArrayList = ArrayList(
            listOf(
                java.lang.String.valueOf(R.mipmap.picture_3),
                "你是我的城池营垒",
                "作者：张彤",
                "更新：第3集 / 共20集",
                "类型：青春 / 喜剧",
                "19.7w",
                "920.6w",
                java.lang.String.valueOf(R.mipmap.top_3)
            )
        )
        information.add(subArrayList)
        information.add(subArrayList)
        information.add(subArrayList)
        information.add(subArrayList)
        information.add(subArrayList)
        information.add(subArrayList)
        return information
    }
}