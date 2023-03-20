package com.practice.navpractice

import android.content.Context
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup


/**
 * A simple [Fragment] subclass.
 * Use the [FragmentA.newInstance] factory method to
 * create an instance of this fragment.
 */
class FragmentA : Fragment() {

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.e(TAG, "onAttach: A")
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e(TAG, "onCreate: A", )
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.e(TAG, "onCreateView: A", )
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_a, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        Log.e(TAG, "onViewCreated: A", )
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onStart() {
        Log.e(TAG, "onStart: A", )
        super.onStart()
    }

    override fun onResume() {
        Log.e(TAG, "onResume: A", )
        super.onResume()
    }

    override fun onPause() {
        Log.e(TAG, "onPause: A", )
        super.onPause()
    }

    override fun onStop() {
        Log.e(TAG, "onStop: A", )
        super.onStop()
    }

    override fun onDestroyView() {
        Log.e(TAG, "onDestroyView: A", )
        super.onDestroyView()
    }

    override fun onDestroy() {
        Log.e(TAG, "onDestroy: A", )
        super.onDestroy()
    }

    override fun onDetach() {
        Log.e(TAG, "onDetach: A", )
        super.onDetach()
    }


    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FragmentA.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance() = FragmentA()
    }
}