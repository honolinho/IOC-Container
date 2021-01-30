package com.android.ioccontainer

import com.android.ioccontainer.di.IActivateType

class ConcreteMain : IActivateType {
    override fun create(valueProvider: () -> Any): Any {
        return ConcreteMain::class.java.simpleName
    }
}