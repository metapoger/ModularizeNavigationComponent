package com.metapoger.splash_screen

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.metapoger.modularizenavigationcomponent.NavAppDirections

class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_splash, container, false)

    override fun onResume() {
        super.onResume()
        Handler().postDelayed({
            findNavController().navigate(NavAppDirections.actionGlobalStartGraph())
        },2000)
    }
}
