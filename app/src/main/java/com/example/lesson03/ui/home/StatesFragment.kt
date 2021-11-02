package com.example.lesson03.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.lesson03.R
import com.example.lesson03.databinding.FragmentDashboardBinding
import com.example.lesson03.databinding.FragmentHomeBinding
import com.example.lesson03.databinding.FragmentNotificationsBinding

class StatesFragment: Fragment() {

    private var _binding: FragmentHomeBinding? = null

    private val binding get() = _binding!!

    val list: ArrayList<StatesItem> = arrayListOf(
        StatesItem(R.drawable.state_img01, "Calm","ajkdalkjda"),
        StatesItem(R.drawable.state_img01, "Calm","ajkdalkjda"),
        StatesItem(R.drawable.state_img01, "Calm","ajkdalkjda"),
        StatesItem(R.drawable.state_img01, "Calm","ajkdalkjda"),
        )


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val recyclerView : RecyclerView = root.findViewById(R.id.stateRecyclerView)
        recyclerView.adapter = StatesRecyclerAdapter(list,requireContext())

        //val stateView: StateView
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}