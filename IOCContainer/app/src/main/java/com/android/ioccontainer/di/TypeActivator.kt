package com.android.ioccontainer.di

import kotlin.reflect.KClass

class TypeActivator(typeRegistry: TypeRegistry) : IActivateTypes {
    override fun create(valueProvider: () -> Any): Any {
        return valueProvider
    }


}