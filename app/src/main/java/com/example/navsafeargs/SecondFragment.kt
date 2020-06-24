package com.example.navsafeargs

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs

class SecondFragment : Fragment(R.layout.fragment_second) {

    private val args: SecondFragmentArgs by navArgs()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val amount = args.amount

        view.findViewById<TextView>(R.id.second_view).text = "amount $amount"
    }
}