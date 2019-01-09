package com.example.ssl.t_mvvmtest.utils


import java.lang.reflect.ParameterizedType


object TUtil {
    fun <T> getInstance(o: Any, i: Int = 0): T? {
        try {
            return ((o.javaClass
                    .genericSuperclass as ParameterizedType).actualTypeArguments[i] as Class<T>)
                    .newInstance()
        } catch (e: Exception) {
            e.printStackTrace()
        }

        return null
    }
}