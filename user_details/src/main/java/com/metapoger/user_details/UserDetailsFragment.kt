package com.metapoger.user_details

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.metapoger.core.User
import kotlinx.android.synthetic.main.fragment_user_details.*


class UserDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ) = inflater.inflate(R.layout.fragment_user_details, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        //TODO
    }

    fun adjustWithUser(user: User){
        userAvatar.setImageDrawable(user.avatar)
        userName.text = user.name
    }
}
