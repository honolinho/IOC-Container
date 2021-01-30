package com.android.ioccontainer

import com.android.ioccontainer.di.IActivateType

class AMain : IActivateType {
    override fun create(valueProvider: () -> Any): Any {
        return AMain::class.java.simpleName
    }
}