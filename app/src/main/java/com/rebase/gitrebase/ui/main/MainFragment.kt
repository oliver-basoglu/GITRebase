package com.rebase.gitrebase.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.rebase.gitrebase.R

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var mainViewModel: MainViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        doSomething()

        // Starting some kind of logic
    }

    override fun onPause() {
        super.onPause()
        //Fragment is paused
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    private fun doSomething() {

    }

}