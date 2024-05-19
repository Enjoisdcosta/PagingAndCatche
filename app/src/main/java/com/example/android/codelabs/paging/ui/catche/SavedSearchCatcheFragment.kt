package com.example.android.codelabs.paging.ui.catche

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.codelabs.paging.R
import com.example.android.codelabs.paging.databinding.ActivitySearchRepositoriesBinding

class SavedSearchCatcheFragment : Fragment() {
    lateinit var binding: ActivitySearchRepositoriesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivitySearchRepositoriesBinding.inflate(layoutInflater)

    }

}