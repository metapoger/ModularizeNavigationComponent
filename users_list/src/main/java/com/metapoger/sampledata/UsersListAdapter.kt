package com.metapoger.sampledata

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import com.metapoger.core.User
import kotlinx.android.synthetic.main.user_item_view.view.*

class UsersListAdapter(private val users: ArrayList<User>, val onClick: (User) -> Unit) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return UserVH(
            LayoutInflater.from(parent.context).inflate(
                R.layout.user_item_view,
                parent,
                false
            )
        ).apply {
            itemView.setOnClickListener {
                if(adapterPosition != RecyclerView.NO_POSITION) onClick(users[adapterPosition])
            }
        }
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        (holder as UserVH).bind(users[position])
    }

    override fun getItemCount() = users.size

    internal class UserVH(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(user: User) {
            itemView.userAvatar.setImageDrawable(user.avatar)
            itemView.userName.text = user.name
        }
    }
}