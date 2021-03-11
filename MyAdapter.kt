

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<Song>): RecyclerView.Adapter<MyAdapter.myViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myViewHolder {
        val inflater:LayoutInflater = LayoutInflater.from(parent.context)
        val view:View = inflater.inflate(R.layout.item_view, parent, false)
        return myViewHolder(view)

    }

    override fun onBindViewHolder(holder: myViewHolder, position: Int) {

        holder.textTitle.text = songs[position].title
        holder.textDescription.text = songs[position].Description

    }

    override fun getItemCount(): Int {
        return songs.size
    }


    class myViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        var textTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var textDescription = itemView.findViewById<TextView>(R.id.txtDescription)
    }
}
