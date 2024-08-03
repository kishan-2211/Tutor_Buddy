package com.example.tutor_buddy

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tutor_buddy.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    private val binding:ActivityLoginBinding by lazy {
        ActivityLoginBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.btn3.setOnClickListener {
            val intent = Intent(this, SignInActivity::class.java)
            startActivity(intent)
        }
        binding.tv8.setOnClickListener {
            val intent2 = Intent(this, SignInActivity::class.java)
            startActivity(intent2)
        }
        binding.btn3.setOnClickListener {
            val intent3 = Intent(this, ChooseLocation::class.java)
            startActivity(intent3)
        }
    }
}