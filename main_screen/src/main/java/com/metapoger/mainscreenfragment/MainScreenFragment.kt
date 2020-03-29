package com.metapoger.mainscreenfragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.metapoger.core.TabNavigationFragment
import kotlinx.android.synthetic.main.fragment_main_screen.*

class MainScreenFragment : TabNavigationFragment() {

    override val containerId = R.id.homeScreenContainer
    override val tabs = listOf(
        Tab("Users", R.navigation.nav_users_list),
        Tab("Settings", R.navigation.nav_settings)
    )
    private lateinit var selectedTab: Tab


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_main_screen, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        usersBtn.setOnClickListener {
            if (selectedTab.name != tabs[0].name) selectTab(tabs[0])
        }

        settingsBtn.setOnClickListener {
            if (selectedTab.name != tabs[1].name) selectTab(tabs[1])
        }
    }

    override fun tabSelected(tab: Tab) {
        selectedTab = tab
        Toast.makeText(requireContext(), tab.name, Toast.LENGTH_SHORT).show()
    }
}
