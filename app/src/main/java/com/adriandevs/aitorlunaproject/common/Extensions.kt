package com.adriandevs.aitorlunaproject.common

import android.view.View

/**
 *
 * @param onClick
 */
fun View.setSingleClickListener(onClick: () -> Unit) {
    var lastClickTime = 0L
    val delayMillis = 5000L //tiempo minimo entre clics ( en Milisegundos ) 5 segundos actualmente

    this.setOnClickListener {
        val currenTime = System.currentTimeMillis()
        if(currenTime - lastClickTime > delayMillis) {
            lastClickTime = currenTime
            onClick()
        }
    }
}