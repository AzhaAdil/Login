package com.example.android.adil.login.Presentation.Sign_up

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.example.android.adil.login.R
import com.example.android.adil.login.databinding.FragmentSignUpBinding

class SignUp : Fragment() {

    lateinit var binding: FragmentSignUpBinding
    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        binding=FragmentSignUpBinding.inflate(inflater)

        val username=binding.username
        val email=binding.email
        val password=binding.password
        binding.Registor.setOnClickListener {
            when{
                TextUtils.isEmpty(username.text.toString())->Toast.makeText(context,"username",Toast.LENGTH_SHORT).show()
                TextUtils.isEmpty(email.text.toString())-> Toast.makeText(context,"email", Toast.LENGTH_SHORT).show()
                TextUtils.isEmpty(password.text.toString())-> Toast.makeText(context,"password", Toast.LENGTH_SHORT).show()
                else->{
                    viewModel.SignUp(username.text.toString(),email.text.toString(),password.text.toString())
                    Toast.makeText(context,"your are Logged", Toast.LENGTH_SHORT).show()
                }
            }
        }

        binding.Already.setOnClickListener {
            findNavController().navigate(R.id.action_signUp_to_loginPage)
        }
        binding.root
        return binding.root
    }



}