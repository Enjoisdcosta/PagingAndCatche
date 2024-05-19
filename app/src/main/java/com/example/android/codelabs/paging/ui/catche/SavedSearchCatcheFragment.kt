package com.example.android.codelabs.paging.ui.catche

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.codelabs.paging.R
import com.example.android.codelabs.paging.databinding.ActivitySearchRepositoriesBinding
import com.example.android.codelabs.paging.ui.test.TestActivity

class SavedSearchCatcheFragment : Fragment() {
    lateinit var binding: ActivitySearchRepositoriesBinding

    override fun onCreateView(
        inflater: LayoutInflater, container : ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_saved_search_catche, container, false)
    }


}
