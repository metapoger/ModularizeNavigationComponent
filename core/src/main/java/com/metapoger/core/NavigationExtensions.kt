package com.metapoger.core


import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.navigation.fragment.NavHostFragment

fun obtainNavHostFragment(
    fragmentManager: FragmentManager,
    fragmentTag: String,
    navGraphId: Int,
    containerId: Int
): NavHostFragment {
    val existingFragment = fragmentManager.findFragmentByTag(fragmentTag) as NavHostFragment?
    existingFragment?.let { return it }

    val navHostFragment = NavHostFragment.create(navGraphId)
    fragmentManager.beginTransaction()
        .add(containerId, navHostFragment, fragmentTag)
        .commitNow()
    return navHostFragment
}

fun getFragmentTag(index: Int) = "bottomNavigation#$index"

//fun Fragment.getRootNavController() = activity?.findNavController()