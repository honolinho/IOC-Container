package com.android.ioccontainer.di

interface IActivateType {
    fun create(valueProvider: () -> Any): Any
}