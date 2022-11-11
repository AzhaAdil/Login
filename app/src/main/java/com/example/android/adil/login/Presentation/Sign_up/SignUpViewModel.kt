package com.example.android.adil.login.Presentation.Sign_up

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.adil.login.datalayer.Repository
import kotlinx.coroutines.launch

class SignUpViewModel : ViewModel() {
    val repo: Repository by lazy { Repository() }
    fun SignUp(username:String,email:String,password:String)=viewModelScope.launch {
        repo.SignUp(username,email,password)

    }
}