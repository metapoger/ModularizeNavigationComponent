package com.metapoger.core

import android.app.Activity
import android.os.Bundle
import android.view.View
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentManager
import androidx.navigation.Navigation.findNavController
import java.lang.IllegalStateException
import kotlin.properties.Delegates


fun BaseFragment.findNavController() = if(view != null){
    findNavController(view!!)
} else{
    throw IllegalAccessError("Fragment's view is not ready yet, use after view inflate")
}

//fun Activity.findNavController() = findNavController(this, R.id.navHost)

fun View.gone(){
    this.visibility = View.GONE
}

fun View.visible(){
    this.visibility = View.VISIBLE
}

//fun FragmentActivity.navigateBackWithResult(result: Bundle) {
//    if(this.supportFragmentManager.findFragmentById(R.id.navHost) == null) throw IllegalStateException("No Nav host fragment")
//    val childFragmentManager = this.supportFragmentManager.findFragmentById(R.id.navHost)?.childFragmentManager
//    var backStackListener: FragmentManager.OnBackStackChangedListener by Delegates.notNull()
//    backStackListener = FragmentManager.OnBackStackChangedListener {
//        (childFragmentManager?.fragments?.get(0) as NavigationResult).onNavigationResult(result)
//        childFragmentManager.removeOnBackStackChangedListener(backStackListener)
//    }
//    childFragmentManager?.addOnBackStackChangedListener(backStackListener)
//    findNavController().popBackStack()
//}