package com.example.android.adil.login.Presentation.Sign_up

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.adil.login.R

class SignUp : Fragment() {

    companion object {
        fun newInstance() = SignUp()
    }

    private lateinit var viewModel: SignUpViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(this).get(SignUpViewModel::class.java)
        return inflater.inflate(R.layout.fragment_sign_up, container, false)

    }



}