package com.example.android.adil.login.Presentation.Login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.text.TextUtils
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.Toast
import androidx.navigation.Navigation
import androidx.navigation.Navigator
import androidx.navigation.fragment.findNavController
import com.example.android.adil.login.R
import com.example.android.adil.login.databinding.ActivityMainBinding
import com.example.android.adil.login.databinding.FragmentLoginPageBinding

class LoginPage : Fragment() {


lateinit var binding: FragmentLoginPageBinding
    private lateinit var viewModel: LoginPageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(LoginPageViewModel::class.java)
        binding=FragmentLoginPageBinding.inflate(inflater)


        binding.Login.setOnClickListener {
            val email=binding.email
            val password=binding.password
            when{

                TextUtils.isEmpty(email.text.toString())-> Toast.makeText(context,"email",Toast.LENGTH_SHORT).show()
                TextUtils.isEmpty(password.text.toString())->Toast.makeText(context,"password",Toast.LENGTH_SHORT).show()
                else->{
                    viewModel.Login(email.text.toString(),password.text.toString())
                    Toast.makeText(context,"your are Logged",Toast.LENGTH_SHORT).show()

                }
            }
        }
        binding.Create.setOnClickListener {
         findNavController().navigate(R.id.action_loginPage_to_signUp)
        }



       return binding.root
    }


}