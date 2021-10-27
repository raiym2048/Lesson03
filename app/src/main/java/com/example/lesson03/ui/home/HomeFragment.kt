package com.example.lesson03.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson03.R
import com.example.lesson03.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {

    private var _binding: FragmentHomeBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!
    val list: ArrayList<FeelingsItem> = arrayListOf(
        FeelingsItem(R.drawable.ic_calm___icon, "Calm"),
        FeelingsItem(R.drawable.ic_calm___icon, "Angry"),
        FeelingsItem(R.drawable.ic_calm___icon, "excited"),
        FeelingsItem(R.drawable.ic_calm___icon, "sleeping"),
        FeelingsItem(R.drawable.ic_calm___icon, "Calm"),
        FeelingsItem(R.drawable.ic_calm___icon, "Angry"),
        FeelingsItem(R.drawable.ic_calm___icon, "excited"),
        FeelingsItem(R.drawable.ic_calm___icon, "sleeping"),

        )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView : RecyclerView = root.findViewById(R.id.feelingsRecyclerView)
        recyclerView.adapter = FeelingsRecylcerAdapter(list,requireContext())
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
/*
package com.sylas.tamagochi.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.sylas.tamagochi.R
import com.sylas.tamagochi.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private var _binding: FragmentHomeBinding? = null
    private val binding get() = _binding!!
    val list: ArrayList<FeelingsItem> = arrayListOf(
        FeelingsItem(R.drawable.ic_calm___icon,"Спокойный"),
        FeelingsItem(R.drawable.ic_calm___icon,"Злой"),
        FeelingsItem(R.drawable.ic_calm___icon,"Взволнованный"),
        FeelingsItem(R.drawable.ic_calm___icon,"Спящий"),
        FeelingsItem(R.drawable.ic_calm___icon,"Спокойный"),
        FeelingsItem(R.drawable.ic_calm___icon,"Злой"),
        FeelingsItem(R.drawable.ic_calm___icon,"Взволнованный")
    )

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView : RecyclerView = root.findViewById(R.id.feelingsRecyclerView)
        recyclerView.adapter = FeelingsRecyclerAdapter(list,requireContext())



        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}*/
