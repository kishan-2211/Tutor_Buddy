package com.example.tutor_buddy.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.interfaces.ItemClickListener
import com.denzcoskun.imageslider.models.SlideModel
import com.example.tutor_buddy.Adapter.TutorAdapter
import com.example.tutor_buddy.R
import com.example.tutor_buddy.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel(R.drawable.b1, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.b2, ScaleTypes.FIT))
        imageList.add(SlideModel(R.drawable.b3, ScaleTypes.FIT))

        val imageSlider = binding.imageSlider
        imageSlider.setImageList(imageList)
        imageSlider.setImageList(imageList, ScaleTypes.FIT)
        imageSlider.setItemClickListener(object : ItemClickListener{
            override fun doubleClick(position: Int) {
                TODO("Not yet implemented")
            }

            override fun onItemSelected(position: Int) {
                val itemPosition = imageList[position]
                val itemMessage ="Selected Image $position"
                Toast.makeText(requireContext(), itemMessage,Toast.LENGTH_SHORT).show()
            }
        })

        val tutorName = listOf("Kishan Singh", "Rahul Dubey", "Sanskar Sarda", "Rohan Chauhan", "Kirat Pal Singh", "Saurabh Pathak", "Satyam Baranwal")
        val tutorAge = listOf("22","21","23","21","22")
        val tutorAddress = listOf("Varanasi", "Kanpur", "Ujjain","Chandigarh", "Punjab")
        val tutorQualification = listOf("Graduation", "Intermediate", "Post Graduation", "Graduation", "Graduation")
        val tutorImage = listOf(R.drawable.psp, R.drawable.img_1, R.drawable.img,R.drawable.img_2 ,R.drawable.gimg)
        val adapter = TutorAdapter(tutorName,tutorAge, tutorAddress, tutorQualification, tutorImage)
        binding.TutorRecyclerView.layoutManager = LinearLayoutManager(requireContext())
        binding.TutorRecyclerView.adapter = adapter
    }
    companion object{

    }
}