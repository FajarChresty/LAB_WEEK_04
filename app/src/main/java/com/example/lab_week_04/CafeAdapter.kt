package com.example.lab_week_04

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class CafeAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {

    private val activityRef: FragmentActivity = fragmentActivity

    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        val desc = when (position) {
            0 -> activityRef.getString(R.string.starbucks_desc)
            1 -> activityRef.getString(R.string.janjijima_desc)
            2 -> activityRef.getString(R.string.kopikenangan_desc)
            else -> ""
        }
        return CafeDetailFragment.newInstance(desc)
    }
}