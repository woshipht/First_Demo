package com.example.pht_first_demo.Version_3

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class V3_ViewPagerAdapter(fm: FragmentManager?, private val fragment: ArrayList<V3_Fragment>): FragmentPagerAdapter(fm!!) {

    override fun getCount(): Int {
        return fragment.size
    }

    override fun getItem(position: Int): Fragment {
        return fragment[position]
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragment[position].title
    }

}