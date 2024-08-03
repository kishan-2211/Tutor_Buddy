package com.example.tutor_buddy.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.tutor_buddy.databinding.TutorItemBinding

class TutorAdapter(private val Name:List<String>, private val Address:List<String>, private val Qualification:List<String>, private val Age: List<String>, private val image:List<Int>) :RecyclerView.Adapter<TutorAdapter.TutorViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TutorViewHolder {

        return TutorViewHolder(TutorItemBinding.inflate(LayoutInflater.from(parent.context),parent,false))

    }

    override fun onBindViewHolder(holder: TutorViewHolder, position: Int) {
        val name = Name[position]
        val age = Age[position]
        val address = Address[position]
        val qualification = Qualification[position]
        val images = image[position]
        holder.bind(name,age,address, qualification,images)
    }
    override fun getItemCount(): Int {
        return Name.size
    }
    class TutorViewHolder (private val binding: TutorItemBinding) : RecyclerView.ViewHolder(binding.root) {
        private val imageView = binding.ivUserPic
        fun bind(name: String,age: String, address: String, qualification: String, images: Int) {
            binding.tvName.text = name
            binding.tvAge.text = age
            binding.tvAddress.text = address
            binding.tvQualification.text = qualification
            imageView.setImageResource(images)
        }
    }

}