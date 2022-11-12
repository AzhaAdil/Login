package com.example.android.adil.login.Network
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase
class Firebase {
private val authentication:FirebaseAuth by lazy { FirebaseAuth.getInstance() }
    private val database:FirebaseDatabase by lazy { FirebaseDatabase.getInstance() }
    fun SignUp(username:String,email:String,password:String){
        val s=authentication.createUserWithEmailAndPassword(email,password).addOnCompleteListener {
           val details= database.reference.child("user")
            val map=HashMap<String,Any>()
            map["username"]=username
                map["email"]=email
            details.child(current_id()!!.uid).setValue(map)

        }
        }
        fun Login(email:String,password:String){
            val s=authentication.signInWithEmailAndPassword(email,password).addOnCompleteListener {}


}
    fun logout()=authentication.signOut()
    private fun current_id()=authentication.currentUser
}