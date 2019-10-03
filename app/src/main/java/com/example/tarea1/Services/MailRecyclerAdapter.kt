package com.example.tarea1.Services
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.tarea1.Activities.EmailActivity
import com.example.tarea1.R
import com.example.tarea1.models.MailPost
import kotlinx.android.synthetic.main.layout_mail_list_item.view.*




class MailRecyclerAdapter(var items: ArrayList<MailPost>)  : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    //private  var items: List<MailPost> = ArrayList()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return MailViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_mail_list_item,parent,false)
        )
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder){
            is MailViewHolder->{
                holder.bind(items.get(position))
            }
        }

    }

    override fun getItemCount(): Int {
        return items.size

    }





class MailViewHolder constructor(
    itemView: View
):RecyclerView.ViewHolder(itemView){
    val mail_title= itemView.mail_title
    val mail_author= itemView.mail_author
    fun bind(mailPost: MailPost){
     mail_title.setText(mailPost.asunto)
     mail_author.setText(mailPost.correo)


        itemView.mail_button.setOnClickListener{
            Toast.makeText(itemView.context, "Opening Email", Toast.LENGTH_SHORT).show()
            val sendData = Intent (itemView.context,EmailActivity::class.java).apply{
                putExtra("correo",mailPost.correo)
                putExtra("asunto",mailPost.asunto)
                putExtra("texto",mailPost.texto)
            }
            itemView.context.startActivity(sendData)



        }


    }
}

}