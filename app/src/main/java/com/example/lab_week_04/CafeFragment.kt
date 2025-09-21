package com.example.lab_week_04

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayoutMediator

class CafeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cafe, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val viewPager = view.findViewById<androidx.viewpager2.widget.ViewPager2>(R.id.view_pager)
        val tabLayout = view.findViewById<com.google.android.material.tabs.TabLayout>(R.id.tab_layout)

        val adapter = CafeAdapter(requireActivity())
        viewPager.adapter = adapter

        TabLayoutMediator(tabLayout, viewPager) { tab, position ->
            tab.text = when (position) {
                0 -> getString(R.string.starbucks_title)
                1 -> getString(R.string.janjijima_title)
                2 -> getString(R.string.kopikenangan_title)
                else -> ""
            }
        }.attach()
    }
}