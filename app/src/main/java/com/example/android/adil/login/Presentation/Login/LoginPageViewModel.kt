package com.example.android.adil.login.Presentation.Login

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.android.adil.login.Network.Firebase
import com.example.android.adil.login.Presentation.Sign_up.SignUp
import com.example.android.adil.login.datalayer.Repository
import kotlinx.coroutines.launch

class LoginPageViewModel : ViewModel() {
val repo:Repository by lazy { Repository() }
    fun Login(email:String,password:String)=viewModelScope.launch {
        repo.Login(email,password)

    }

}