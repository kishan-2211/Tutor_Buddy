package com.example.tutor_buddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutor_buddy.databinding.ActivityLoginBinding
import com.example.tutor_buddy.databinding.ActivitySignInBinding

class SignInActivity : AppCompatActivity(){
    private val binding:ActivitySignInBinding by lazy{
        ActivitySignInBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textView7.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
            binding.button3.setOnClickListener {
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
        }
    }
}