package com.example.android.adil.login.Presentation.Login

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import com.example.android.adil.login.R

class LoginPage : Fragment() {



    private lateinit var viewModel: LoginPageViewModel

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        viewModel = ViewModelProvider(this).get(LoginPageViewModel::class.java)
        val view:View= inflater.inflate(R.layout.fragment_login_page, container, false)

        return  view
    }


}