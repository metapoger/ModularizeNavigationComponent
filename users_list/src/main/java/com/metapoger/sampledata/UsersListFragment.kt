package com.metapoger.sampledata

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.metapoger.core.User
import com.metapoger.data_storage.MemoryUserRepository
import kotlinx.android.synthetic.main.fragment_users_list.*

class UsersListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_users_list, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = UsersListAdapter(MemoryUserRepository.getUsersList()){
            goToUserDetails(it)
        }
        with(usersListRV){
            layoutManager = LinearLayoutManager(context, RecyclerView.VERTICAL, false)
            this.adapter = adapter
        }
    }

    private fun goToUserDetails(user: User){

    }
}
