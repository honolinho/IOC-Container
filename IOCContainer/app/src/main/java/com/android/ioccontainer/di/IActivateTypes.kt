package com.android.ioccontainer.di



interface IActivateTypes {
    fun create(valueProvider: () -> Any): Any
}