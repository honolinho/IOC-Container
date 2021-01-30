package com.android.ioccontainer.di

import kotlin.reflect.KClass

class LifeCycleManagingTypeActivator(creator: IActivateTypes) : IActivateTypes {
    private var _instanceCache = mutableMapOf<KClass<*>, Any>()
    private var _activator : IActivateTypes = creator


    override fun create(valueProvider: () -> Any): Any {
        return valueProvider
    }
}