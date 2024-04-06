package com.example.lesson_31

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import com.example.lesson_31.databinding.FragmentFirstBinding

//
class FirstFragment : Fragment() {
    private var bidding: FragmentFirstBinding? = null
    private var viewModel: MainViewModel? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        bidding = FragmentFirstBinding.inflate(inflater, container, false)
        return bidding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val count = 0
        viewModel = ViewModelProvider(this, MainViewModelFactory(count))[MainViewModel::class.java]
        observeCounter()
        bidding?.btnCounter?.setOnClickListener {
            viewModel?.plusCount()
        }

    }

    private fun observeCounter() {
        viewModel?.countLiveData?.observe(viewLifecycleOwner){
            bidding?.tvCounter?.text = it.toString()
        }

    }
}