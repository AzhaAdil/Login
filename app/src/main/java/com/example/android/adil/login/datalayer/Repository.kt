package com.example.android.adil.login.datalayer

import com.example.android.adil.login.Network.Firebase
import com.example.android.adil.login.Presentation.Sign_up.SignUp

class Repository {
private  val firebase: Firebase by lazy{ Firebase() }
    suspend fun SignUp(username:String,email:String,password:String)=firebase.SignUp(username,email,password)
    suspend fun Login(email: String,password: String)=firebase.Login(email,password)
}