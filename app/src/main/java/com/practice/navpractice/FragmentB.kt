package com.practice.navpractice

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.practice.navpractice.databinding.FragmentBBinding


class FragmentB : Fragment() {
    val args: FragmentBArgs by navArgs()
    lateinit var bd: FragmentBBinding
    override fun onAttach(context: Context) {
        Log.e(TAG, "onAttach: B")
        super.onAttach(context)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        Log.e(TAG, "onCreate: B")
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG, "onCreateView: B")
        // Inflate the layout for this fragment
        bd = DataBindingUtil.inflate(inflater, R.layout.fragment_b, container, false)
        return bd.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e(TAG, "onViewCreated: B")
        super.onViewCreated(view, savedInstanceState)
        bd.label.text = "${args.time}"
    }

    override fun onStart() {
        Log.e(TAG, "onStart: B")
        super.onStart()
    }

    override fun onResume() {
        Log.e(TAG, "onResume: B")
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "onPause: B")
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop: B")
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e(TAG, "onDestroyView: B")
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: B")
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e(TAG, "onDetach: B")
        super.onDetach()
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentB.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() =
            FragmentB()
    }
}