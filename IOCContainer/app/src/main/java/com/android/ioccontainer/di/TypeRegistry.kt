package com.android.ioccontainer.di

import kotlin.reflect.KClass

class TypeRegistry {


    inline fun <reified T1 : Any, reified T2 : Any> bind(): TypeRegistry {
        return bind(T1::class, T2::class)
    }

    @JvmOverloads
    fun bind(
            from: KClass<*>,
            to: KClass<*>? = null,
            ): TypeRegistry {
        val target = to ?: from
        return this
    }
}