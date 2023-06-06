package com.test.kotlinapicallingusingretrofit

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter(val list:ArrayList<DataModelItem> ,val context:Context):
    RecyclerView.Adapter<RecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val idText : TextView=itemView.findViewById(R.id.id);
        val userIdText:TextView=itemView.findViewById(R.id.user_id);
        val titleText :TextView=itemView.findViewById(R.id.text_title);
        val bodyText : TextView=itemView.findViewById(R.id.text_body)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.design_layout,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {

        return  list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentItem=list[position]
        holder.apply {
            userIdText.text=currentItem.userId.toString()
            idText.text=currentItem.id.toString()
            titleText.text=currentItem.title
            bodyText.text=currentItem.body


        }

    }
}