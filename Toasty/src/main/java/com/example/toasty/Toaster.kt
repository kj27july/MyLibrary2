package com.example.toasty


import android.content.Context
import android.util.Log
import android.widget.Toast

object Toaster  {
    fun simpleToast(context: Context, msg: String) {
        Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
//        Log.d("displayToast", "simpleToast:1")
    }

    internal fun sum(a: Int, b: Int): Int {
        return a + b
//        Log.d("displayToast", (a + b).toString())
    }

    fun result(): Int {
        val res:Int=sum(10, 20)
        return  res
//        Log.d("displayToast", res.toString())
    }


    object Toaster2 {
        fun simpleToast(context: Context) {
            Toast.makeText(context, "Inside Toaster", Toast.LENGTH_SHORT).show()
//            Log.d("displayToasts", "simpleToast: 2")
        }
    }
}