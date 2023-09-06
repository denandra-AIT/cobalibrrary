package com.example.examplelibrary

import android.content.Context
import android.widget.Toast

object Toaster {

    fun c(context: Context, text: String) {
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show()
    }
}